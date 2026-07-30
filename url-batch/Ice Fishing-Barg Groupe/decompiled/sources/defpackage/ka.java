package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ka extends t52 implements Map {
    public ja cpQdD2nAriOS;
    public fa dgRBjINgWbAK;
    public ha x50lh2ztY7Y5;

    public final boolean OPXfSBeufaJ8(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        fa faVar = this.dgRBjINgWbAK;
        if (faVar != null) {
            return faVar;
        }
        fa faVar2 = new fa(this);
        this.dgRBjINgWbAK = faVar2;
        return faVar2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        ha haVar = this.x50lh2ztY7Y5;
        if (haVar != null) {
            return haVar;
        }
        ha haVar2 = new ha(this);
        this.x50lh2ztY7Y5 = haVar2;
        return haVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.wdg6QnbFHrFF;
        int i = this.wdg6QnbFHrFF;
        int[] iArr = this.rtx2ld2ELZv4;
        if (iArr.length < size) {
            this.rtx2ld2ELZv4 = Arrays.copyOf(iArr, size);
            this.OPXfSBeufaJ8 = Arrays.copyOf(this.OPXfSBeufaJ8, size * 2);
        }
        if (this.wdg6QnbFHrFF != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        ja jaVar = this.cpQdD2nAriOS;
        if (jaVar != null) {
            return jaVar;
        }
        ja jaVar2 = new ja(this);
        this.cpQdD2nAriOS = jaVar2;
        return jaVar2;
    }

    public final boolean wdg6QnbFHrFF(Collection collection) {
        int i = this.wdg6QnbFHrFF;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.wdg6QnbFHrFF;
    }
}
