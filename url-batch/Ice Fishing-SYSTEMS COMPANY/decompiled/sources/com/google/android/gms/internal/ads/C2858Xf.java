package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import o2.C4829b;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.Xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2858Xf extends d1.f {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f28659v = 2;

    /* renamed from: w, reason: collision with root package name */
    public final Object f28660w;

    public C2858Xf(Context context) {
        super(2);
        this.f28660w = context;
    }

    @Override // d1.f
    public final void k() {
        BitmapDrawable bitmapDrawable;
        boolean z8 = false;
        switch (this.f28659v) {
            case 0:
                C2892Zf c2892Zf = (C2892Zf) this.f28660w;
                C2518Df c2518Df = new C2518Df(c2892Zf.f29016e, c2892Zf.f29017f.f41217n);
                synchronized (c2892Zf.f29012a) {
                    try {
                        T2 t22 = p2.j.f39798C.f39812m;
                        T2.q(c2892Zf.f29019h, c2518Df);
                    } catch (IllegalArgumentException e6) {
                        int i = t2.C.f40822b;
                        u2.i.g("Cannot config CSI reporter.", e6);
                    }
                }
                return;
            case 1:
                i8.m mVar = p2.j.f39798C.f39822w;
                BinderC4996d binderC4996d = (BinderC4996d) this.f28660w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) mVar.f38384n).get(Integer.valueOf(binderC4996d.f40456v.f23722H.f39788y));
                if (bitmap != null) {
                    p2.f fVar = binderC4996d.f40456v.f23722H;
                    boolean z9 = fVar.f39786w;
                    Activity activity = binderC4996d.f40455u;
                    if (z9) {
                        float f6 = fVar.f39787x;
                        if (f6 > 0.0f && f6 <= 25.0f) {
                            try {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                                RenderScript create = RenderScript.create(activity);
                                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                                create2.setRadius(f6);
                                create2.setInput(createFromBitmap);
                                create2.forEach(createFromBitmap2);
                                createFromBitmap2.copyTo(createBitmap);
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), createBitmap);
                            } catch (RuntimeException unused) {
                                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                            }
                            t2.G.f40858l.post(new h3.l(this, bitmapDrawable, 10, z8));
                            return;
                        }
                    }
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    t2.G.f40858l.post(new h3.l(this, bitmapDrawable, 10, z8));
                    return;
                }
                return;
            default:
                try {
                    z8 = C4829b.b((Context) this.f28660w);
                } catch (L2.g | IOException | IllegalStateException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.d("Fail to get isAdIdFakeForDebugLogging", e9);
                }
                synchronized (u2.f.f41231b) {
                    u2.f.f41232c = true;
                    u2.f.f41233d = z8;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(z8).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(z8);
                String sb2 = sb.toString();
                int i9 = t2.C.f40822b;
                u2.i.f(sb2);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2858Xf(C2892Zf c2892Zf) {
        super(2);
        Objects.requireNonNull(c2892Zf);
        this.f28660w = c2892Zf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2858Xf(BinderC4996d binderC4996d) {
        super(2);
        Objects.requireNonNull(binderC4996d);
        this.f28660w = binderC4996d;
    }
}
