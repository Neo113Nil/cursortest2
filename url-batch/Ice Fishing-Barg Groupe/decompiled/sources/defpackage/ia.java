package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ia implements Iterator, Map.Entry {
    public int OPXfSBeufaJ8 = -1;
    public final /* synthetic */ ka dgRBjINgWbAK;
    public int rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public ia(ka kaVar) {
        this.dgRBjINgWbAK = kaVar;
        this.rtx2ld2ELZv4 = kaVar.wdg6QnbFHrFF - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.OPXfSBeufaJ8;
            ka kaVar = this.dgRBjINgWbAK;
            if (cs0.wdg6QnbFHrFF(key, kaVar.e9gEMXR7LXtO(i)) && cs0.wdg6QnbFHrFF(entry.getValue(), kaVar.rtx2ld2ELZv4(this.OPXfSBeufaJ8))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.wdg6QnbFHrFF) {
            return this.dgRBjINgWbAK.e9gEMXR7LXtO(this.OPXfSBeufaJ8);
        }
        u9.rtx2ld2ELZv4("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.wdg6QnbFHrFF) {
            return this.dgRBjINgWbAK.rtx2ld2ELZv4(this.OPXfSBeufaJ8);
        }
        u9.rtx2ld2ELZv4("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OPXfSBeufaJ8 < this.rtx2ld2ELZv4;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.wdg6QnbFHrFF) {
            u9.rtx2ld2ELZv4("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.OPXfSBeufaJ8;
        ka kaVar = this.dgRBjINgWbAK;
        Object e9gEMXR7LXtO = kaVar.e9gEMXR7LXtO(i);
        Object rtx2ld2ELZv4 = kaVar.rtx2ld2ELZv4(this.OPXfSBeufaJ8);
        return (e9gEMXR7LXtO == null ? 0 : e9gEMXR7LXtO.hashCode()) ^ (rtx2ld2ELZv4 != null ? rtx2ld2ELZv4.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        this.OPXfSBeufaJ8++;
        this.wdg6QnbFHrFF = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wdg6QnbFHrFF) {
            throw new IllegalStateException();
        }
        this.dgRBjINgWbAK.a92UlCVFR9N8(this.OPXfSBeufaJ8);
        this.OPXfSBeufaJ8--;
        this.rtx2ld2ELZv4--;
        this.wdg6QnbFHrFF = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.wdg6QnbFHrFF) {
            return this.dgRBjINgWbAK.RAsUl2FVSrh6(this.OPXfSBeufaJ8, obj);
        }
        u9.rtx2ld2ELZv4("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
