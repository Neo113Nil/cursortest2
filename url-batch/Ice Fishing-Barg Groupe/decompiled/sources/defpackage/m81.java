package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m81 implements ListIterator, fu0 {
    public final List OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public m81(List list, int i, int i2) {
        this.rtx2ld2ELZv4 = i2;
        switch (i2) {
            case 1:
                this.OPXfSBeufaJ8 = list;
                this.wdg6QnbFHrFF = i;
                break;
            default:
                this.OPXfSBeufaJ8 = list;
                this.wdg6QnbFHrFF = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                int i2 = this.wdg6QnbFHrFF + 1;
                this.wdg6QnbFHrFF = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.wdg6QnbFHrFF, obj);
                this.wdg6QnbFHrFF++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                if (this.wdg6QnbFHrFF < list.size() - 1) {
                    break;
                }
                break;
            default:
                if (this.wdg6QnbFHrFF < list.size()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (this.wdg6QnbFHrFF >= 0) {
                }
                break;
            default:
                if (this.wdg6QnbFHrFF > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                int i2 = this.wdg6QnbFHrFF + 1;
                this.wdg6QnbFHrFF = i2;
                return list.get(i2);
            default:
                int i3 = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return this.wdg6QnbFHrFF + 1;
            default:
                return this.wdg6QnbFHrFF;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                int i2 = this.wdg6QnbFHrFF;
                this.wdg6QnbFHrFF = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.wdg6QnbFHrFF - 1;
                this.wdg6QnbFHrFF = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return this.wdg6QnbFHrFF;
            default:
                return this.wdg6QnbFHrFF - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                list.remove(this.wdg6QnbFHrFF);
                this.wdg6QnbFHrFF--;
                break;
            default:
                int i2 = this.wdg6QnbFHrFF - 1;
                this.wdg6QnbFHrFF = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.rtx2ld2ELZv4;
        List list = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                list.set(this.wdg6QnbFHrFF, obj);
                break;
            default:
                list.set(this.wdg6QnbFHrFF, obj);
                break;
        }
    }
}
