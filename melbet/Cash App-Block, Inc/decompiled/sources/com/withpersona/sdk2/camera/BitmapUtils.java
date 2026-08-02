package com.withpersona.sdk2.camera;

import android.media.Image;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.formview.viewmodels.ClientScenarioAndFlowToken;
import com.squareup.protos.franklin.api.ClientScenario;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class BitmapUtils {
    public static final ClientScenarioAndFlowToken toClientScenarioAndFlowToken(BlockersScreens blockersScreens) {
        blockersScreens.getClass();
        ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
        if (clientScenario != null) {
            return new ClientScenarioAndFlowToken(clientScenario, blockersScreens.getBlockersData().flowToken);
        }
        return null;
    }

    public static void unpackPlane(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i5 = i / (i2 / rowStride);
        int i6 = 0;
        for (int i7 = 0; i7 < rowStride; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
