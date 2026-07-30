package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    LineBuffer() {
    }

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z7) {
        handleLine(this.line.toString(), this.sawReturn ? z7 ? "\r\n" : "\r" : z7 ? "\n" : "");
        this.line = new StringBuilder();
        this.sawReturn = false;
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void add(char[] cArr, int i8, int i9) {
        int i10;
        int i11;
        if (this.sawReturn && i9 > 0) {
            if (finishLine(cArr[i8] == '\n')) {
                i10 = i8 + 1;
                i11 = i8 + i9;
                int i12 = i10;
                while (i10 < i11) {
                    char c8 = cArr[i10];
                    if (c8 == '\n') {
                        this.line.append(cArr, i12, i10 - i12);
                        finishLine(true);
                    } else if (c8 != '\r') {
                        i10++;
                    } else {
                        this.line.append(cArr, i12, i10 - i12);
                        this.sawReturn = true;
                        int i13 = i10 + 1;
                        if (i13 < i11) {
                            if (finishLine(cArr[i13] == '\n')) {
                                i10 = i13;
                            }
                        }
                    }
                    i12 = i10 + 1;
                    i10++;
                }
                this.line.append(cArr, i12, i11 - i12);
            }
        }
        i10 = i8;
        i11 = i8 + i9;
        int i122 = i10;
        while (i10 < i11) {
        }
        this.line.append(cArr, i122, i11 - i122);
    }

    protected void finish() {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }

    protected abstract void handleLine(String str, String str2);
}
