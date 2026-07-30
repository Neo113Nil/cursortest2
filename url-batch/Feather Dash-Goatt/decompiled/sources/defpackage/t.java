package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class t implements Iterator, yb0 {
    public final /* synthetic */ int d = 0;
    public int e;
    public final Object g;

    public t(Object[] objArr) {
        objArr.getClass();
        this.g = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < ((w) obj).a()) {
                    break;
                }
                break;
            default:
                if (this.e < ((Object[]) obj).length) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    dd0.c();
                    return null;
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((w) obj).get(i2);
            default:
                try {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.e--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(w wVar) {
        this.g = wVar;
    }
}
