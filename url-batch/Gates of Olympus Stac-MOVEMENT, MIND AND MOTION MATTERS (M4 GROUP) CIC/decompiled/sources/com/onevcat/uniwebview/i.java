package com.onevcat.uniwebview;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i {
    public final l a;
    public String b;
    public final boolean c;

    public i(l downloadType, String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = downloadType;
        this.b = fileName;
        this.c = z;
    }

    public final String a() {
        l lVar = this.a;
        if (lVar instanceof k) {
            return ((k) lVar).a;
        }
        if (lVar instanceof j) {
            return ((j) lVar).a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.a, iVar.a) && Intrinsics.areEqual(this.b, iVar.b) && this.c == iVar.c;
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
