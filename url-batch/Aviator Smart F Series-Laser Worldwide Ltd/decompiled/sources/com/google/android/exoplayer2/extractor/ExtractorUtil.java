package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import org.checkerframework.dataflow.qual.Pure;

@Deprecated
/* loaded from: classes3.dex */
public final class ExtractorUtil {
    private ExtractorUtil() {
    }

    @Pure
    public static void checkContainerInput(boolean z7, @Nullable String str) {
        if (!z7) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static boolean peekFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i8, int i9, boolean z7) {
        try {
            return extractorInput.peekFully(bArr, i8, i9, z7);
        } catch (EOFException e8) {
            if (z7) {
                return false;
            }
            throw e8;
        }
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i8, int i9) {
        int i10 = 0;
        while (i10 < i9) {
            int peek = extractorInput.peek(bArr, i8 + i10, i9 - i10);
            if (peek == -1) {
                break;
            }
            i10 += peek;
        }
        return i10;
    }

    public static boolean readFullyQuietly(ExtractorInput extractorInput, byte[] bArr, int i8, int i9) {
        try {
            extractorInput.readFully(bArr, i8, i9);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(ExtractorInput extractorInput, int i8) {
        try {
            extractorInput.skipFully(i8);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
