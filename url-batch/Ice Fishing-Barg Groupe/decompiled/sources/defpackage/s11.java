package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s11 implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public int dgRBjINgWbAK;
    public final String rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public s11(String str) {
        this.rtx2ld2ELZv4 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.OPXfSBeufaJ8;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.x50lh2ztY7Y5 < 0) {
            this.OPXfSBeufaJ8 = 2;
            return false;
        }
        String str = this.rtx2ld2ELZv4;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.wdg6QnbFHrFF; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.OPXfSBeufaJ8 = 1;
                this.x50lh2ztY7Y5 = i;
                this.dgRBjINgWbAK = length;
                return true;
            }
        }
        i = -1;
        this.OPXfSBeufaJ8 = 1;
        this.x50lh2ztY7Y5 = i;
        this.dgRBjINgWbAK = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        this.OPXfSBeufaJ8 = 0;
        int i = this.dgRBjINgWbAK;
        int i2 = this.wdg6QnbFHrFF;
        this.wdg6QnbFHrFF = this.x50lh2ztY7Y5 + i;
        return this.rtx2ld2ELZv4.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
