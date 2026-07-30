package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class te extends x {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public te(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    dd0.c();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.h;
                    int i = this.d;
                    this.d = i + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    dd0.c();
                    break;
                } else {
                    this.d++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    dd0.c();
                    break;
                } else {
                    Object[] objArr = (Object[]) this.h;
                    int i = this.d - 1;
                    this.d = i;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    dd0.c();
                    break;
                } else {
                    this.d--;
                    break;
                }
        }
        return null;
    }

    public te(int i, Object obj) {
        super(i, 1);
        this.h = obj;
    }
}
