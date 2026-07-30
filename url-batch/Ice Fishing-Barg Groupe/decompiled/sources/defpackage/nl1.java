package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nl1 extends BjEWd04qc7Mw {
    public final gl1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ nl1(int i, gl1 gl1Var) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = gl1Var;
    }

    @Override // defpackage.BjEWd04qc7Mw
    public final int PxuCJdSBwIXG() {
        switch (this.rtx2ld2ELZv4) {
        }
        return this.OPXfSBeufaJ8.x50lh2ztY7Y5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                this.OPXfSBeufaJ8.clear();
                break;
            default:
                this.OPXfSBeufaJ8.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                gl1 gl1Var = this.OPXfSBeufaJ8;
                Object obj2 = gl1Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && gl1Var.containsKey(entry.getKey());
            default:
                return this.OPXfSBeufaJ8.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return new ol1(this.OPXfSBeufaJ8);
            default:
                ul2[] ul2VarArr = new ul2[8];
                for (int i = 0; i < 8; i++) {
                    ul2VarArr[i] = new vl2(1);
                }
                return new pl1(this.OPXfSBeufaJ8, ul2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.OPXfSBeufaJ8.remove(entry.getKey(), entry.getValue());
            default:
                gl1 gl1Var = this.OPXfSBeufaJ8;
                if (!gl1Var.containsKey(obj)) {
                    return false;
                }
                gl1Var.remove(obj);
                return true;
        }
    }
}
