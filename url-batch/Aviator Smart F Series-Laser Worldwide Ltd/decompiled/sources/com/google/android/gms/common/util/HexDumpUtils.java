package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
/* loaded from: classes3.dex */
public final class HexDumpUtils {
    @Nullable
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i8, int i9, boolean z7) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i8 < 0 || i9 <= 0 || i8 + i9 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z7 ? 75 : 57) * ((i9 + 15) / 16));
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        while (i10 > 0) {
            if (i11 == 0) {
                if (i9 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i8)));
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i8)));
                }
                i12 = i8;
            } else if (i11 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i8] & 255)));
            i10--;
            i11++;
            if (z7 && (i11 == 16 || i10 == 0)) {
                int i13 = 16 - i11;
                if (i13 > 0) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        sb.append("   ");
                    }
                }
                if (i13 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i15 = 0; i15 < i11; i15++) {
                    char c8 = (char) bArr[i12 + i15];
                    if (c8 < ' ' || c8 > '~') {
                        c8 = '.';
                    }
                    sb.append(c8);
                }
            }
            if (i11 == 16 || i10 == 0) {
                sb.append('\n');
                i11 = 0;
            }
            i8++;
        }
        return sb.toString();
    }
}
