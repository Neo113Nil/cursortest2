package dev.chrisbanes.haze;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class RenderScriptContext {
    public final ScriptIntrinsicBlur blurScript;
    public final BufferedChannel channel;
    public final Allocation inputAlloc;
    public boolean isDestroyed;
    public final Allocation outputAlloc;
    public final Bitmap outputBitmap;
    public final RenderScript rs;
    public final long size;

    public RenderScriptContext(RenderScript renderScript, long j) {
        renderScript.getClass();
        this.rs = renderScript;
        this.size = j;
        this.channel = PapaEvent.Channel$default(-1, null, null, 6);
        int i = (int) (j >> 32);
        int i2 = (i % 4) + i;
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        int i4 = (i3 % 4) + i3;
        Allocation createTyped = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8_4(renderScript)).setX(i2).setY(i4).create(), 33);
        createTyped.getClass();
        this.inputAlloc = createTyped;
        createTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: dev.chrisbanes.haze.RenderScriptContext$$ExternalSyntheticLambda0
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                RenderScriptContext renderScriptContext = RenderScriptContext.this;
                if (renderScriptContext.isDestroyed) {
                    return;
                }
                allocation.ioReceive();
                ChannelsKt__ChannelsKt.trySendBlocking(Unit.INSTANCE, renderScriptContext.channel);
            }
        });
        Bitmap createBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
        this.outputBitmap = createBitmap;
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, createBitmap);
        createFromBitmap.getClass();
        this.outputAlloc = createFromBitmap;
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.getClass();
        this.blurScript = create;
        create.setInput(createTyped);
    }
}
