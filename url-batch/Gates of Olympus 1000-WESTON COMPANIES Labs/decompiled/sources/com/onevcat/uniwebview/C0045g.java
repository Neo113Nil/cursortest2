package com.onevcat.uniwebview;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0045g {
    public final AbstractC0054j a;
    public String b;
    public final boolean c;

    public C0045g(AbstractC0054j downloadType, String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = downloadType;
        this.b = fileName;
        this.c = z;
    }

    public final String a() {
        AbstractC0054j abstractC0054j = this.a;
        if (abstractC0054j instanceof C0051i) {
            return ((C0051i) abstractC0054j).a;
        }
        if (abstractC0054j instanceof C0048h) {
            return ((C0048h) abstractC0054j).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0045g)) {
            return false;
        }
        C0045g c0045g = (C0045g) obj;
        return Intrinsics.areEqual(this.a, c0045g.a) && Intrinsics.areEqual(this.b, c0045g.b) && this.c == c0045g.c;
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
