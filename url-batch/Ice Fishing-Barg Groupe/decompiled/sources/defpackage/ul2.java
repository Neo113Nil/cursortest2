package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ul2 implements Iterator, fu0 {
    public int OPXfSBeufaJ8;
    public Object[] rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public ul2() {
        tl2.Companion.getClass();
        this.rtx2ld2ELZv4 = tl2.e9gEMXR7LXtO.Y1f8riQaR6yg;
    }

    public final void PxuCJdSBwIXG(Object[] objArr, int i, int i2) {
        this.rtx2ld2ELZv4 = objArr;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.wdg6QnbFHrFF < this.OPXfSBeufaJ8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
