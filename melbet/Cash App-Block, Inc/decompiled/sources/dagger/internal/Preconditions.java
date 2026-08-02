package dagger.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.math.IntMath$1;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.anim.Keyframe;
import com.squareup.cash.graphics.swampgl.anim.TransformChannel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.utils.ColorUtils;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.ByteStreamsKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class Preconditions {
    public static void checkBuilderRequirement(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        f$$ExternalSyntheticLambda0.m((Object) cls.getCanonicalName(), (Object) " must be set");
    }

    public static void checkNotNullFromProvides(Object obj) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2("Cannot return null from a non-@Nullable @Provides method");
    }

    public static int divide(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("/ by zero");
            return 0;
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (IntMath$1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                ColorUtils.checkRoundingUnnecessary(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return 0;
        }
        return i3 + i5;
    }

    public static SVGAndroidRenderer load(InputStream inputStream) {
        ByteBuffer order = ByteBuffer.wrap(ByteStreamsKt.readBytes(inputStream)).order(ByteOrder.LITTLE_ENDIAN);
        byte[] bArr = new byte[8];
        order.get(bArr);
        Charset charset = Charsets.UTF_8;
        if (!new String(bArr, charset).equals("CASHANIM")) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) "Invalid magic: ".concat(new String(bArr, charset)));
            return null;
        }
        int i = order.getInt();
        if (i != 1) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported version: "));
            return null;
        }
        float f = order.getFloat();
        order.getFloat();
        int i2 = 0;
        IntRange until = RangesKt___RangesKt.until(0, order.getInt());
        int i3 = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            it.nextInt();
            byte[] bArr2 = new byte[order.getShort()];
            order.get(bArr2);
            String str = new String(bArr2, Charsets.UTF_8);
            IntRange until2 = RangesKt___RangesKt.until(i2, order.getInt());
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until2, i3));
            IntProgressionIterator it2 = until2.iterator();
            while (it2.hasNext) {
                it2.nextInt();
                arrayList2.add(new Keyframe(new Vector3(order.getFloat(), order.getFloat(), order.getFloat()), order.getFloat()));
            }
            IntRange until3 = RangesKt___RangesKt.until(i2, order.getInt());
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until3, i3));
            IntProgressionIterator it3 = until3.iterator();
            while (it3.hasNext) {
                it3.nextInt();
                arrayList3.add(new Keyframe(new Quat(order.getFloat(), order.getFloat(), order.getFloat(), order.getFloat()), order.getFloat()));
            }
            IntRange until4 = RangesKt___RangesKt.until(i2, order.getInt());
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until4, 10));
            IntProgressionIterator it4 = until4.iterator();
            while (it4.hasNext) {
                it4.nextInt();
                arrayList4.add(new Keyframe(new Vector3(order.getFloat(), order.getFloat(), order.getFloat()), order.getFloat()));
            }
            arrayList.add(new TransformChannel(str, arrayList2, arrayList3, arrayList4));
            i3 = 10;
            i2 = 0;
        }
        return new SVGAndroidRenderer(f, arrayList);
    }
}
