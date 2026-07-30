package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class r41 implements Map.Entry, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public /* synthetic */ r41(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && cs0.wdg6QnbFHrFF(entry.getKey(), this.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.rtx2ld2ELZv4) {
        }
        return this.OPXfSBeufaJ8;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.rtx2ld2ELZv4) {
        }
        return this.wdg6QnbFHrFF;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                Object obj = this.OPXfSBeufaJ8;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return hashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.OPXfSBeufaJ8);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
