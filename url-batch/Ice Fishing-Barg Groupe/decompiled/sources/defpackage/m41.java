package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m41 implements Map.Entry, fu0 {
    public final int OPXfSBeufaJ8;
    public final o41 rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public m41(o41 o41Var, int i) {
        o41Var.getClass();
        this.rtx2ld2ELZv4 = o41Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = o41Var.QrzZRwfaDlRX;
    }

    public final void PxuCJdSBwIXG() {
        if (this.rtx2ld2ELZv4.QrzZRwfaDlRX != this.wdg6QnbFHrFF) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return cs0.wdg6QnbFHrFF(entry.getKey(), getKey()) && cs0.wdg6QnbFHrFF(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        PxuCJdSBwIXG();
        return this.rtx2ld2ELZv4.rtx2ld2ELZv4[this.OPXfSBeufaJ8];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        PxuCJdSBwIXG();
        Object[] objArr = this.rtx2ld2ELZv4.OPXfSBeufaJ8;
        objArr.getClass();
        return objArr[this.OPXfSBeufaJ8];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        PxuCJdSBwIXG();
        o41 o41Var = this.rtx2ld2ELZv4;
        o41Var.TSizfFm2Yiuu();
        Object[] objArr = o41Var.OPXfSBeufaJ8;
        if (objArr == null) {
            int length = o41Var.rtx2ld2ELZv4.length;
            if (length < 0) {
                u9.XL4ISE6Oc65B("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            o41Var.OPXfSBeufaJ8 = objArr;
        }
        int i = this.OPXfSBeufaJ8;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
