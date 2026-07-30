package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073k {
    public final AbstractC0085n a;
    public String b;
    public final boolean c;

    public C0073k(AbstractC0085n downloadType, String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = downloadType;
        this.b = fileName;
        this.c = z;
    }

    public final String a() {
        AbstractC0085n abstractC0085n = this.a;
        if (abstractC0085n instanceof C0081m) {
            return ((C0081m) abstractC0085n).a;
        }
        if (abstractC0085n instanceof C0077l) {
            return ((C0077l) abstractC0085n).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073k)) {
            return false;
        }
        C0073k c0073k = (C0073k) obj;
        return Intrinsics.areEqual(this.a, c0073k.a) && Intrinsics.areEqual(this.b, c0073k.b) && this.c == c0073k.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DownloadTask(downloadType=" + this.a + ", fileName=" + this.b + ", shouldSendEvent=" + this.c + ')';
    }
}
