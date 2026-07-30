package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gl1 extends AbstractMap implements Map, gu0 {
    public tl2 OPXfSBeufaJ8;
    public il1 cpQdD2nAriOS;
    public int dgRBjINgWbAK;
    public ib0 rtx2ld2ELZv4 = new ib0(6);
    public Object wdg6QnbFHrFF;
    public int x50lh2ztY7Y5;

    public gl1(il1 il1Var) {
        this.OPXfSBeufaJ8 = il1Var.rtx2ld2ELZv4;
        this.x50lh2ztY7Y5 = il1Var.OPXfSBeufaJ8;
        this.cpQdD2nAriOS = il1Var;
    }

    public final il1 PxuCJdSBwIXG() {
        tl2 tl2Var = this.OPXfSBeufaJ8;
        il1 il1Var = this.cpQdD2nAriOS;
        if (tl2Var != il1Var.rtx2ld2ELZv4) {
            this.rtx2ld2ELZv4 = new ib0(6);
            il1Var = new il1(this.OPXfSBeufaJ8, this.x50lh2ztY7Y5);
        }
        this.cpQdD2nAriOS = il1Var;
        return il1Var;
    }

    public final Object TSizfFm2Yiuu(Object obj) {
        return this.OPXfSBeufaJ8.RAsUl2FVSrh6(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object Y1f8riQaR6yg(Object obj) {
        this.wdg6QnbFHrFF = null;
        tl2 r3s1LDPKFs1S = this.OPXfSBeufaJ8.r3s1LDPKFs1S(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (r3s1LDPKFs1S == null) {
            tl2.Companion.getClass();
            r3s1LDPKFs1S = tl2.e9gEMXR7LXtO;
        }
        this.OPXfSBeufaJ8 = r3s1LDPKFs1S;
        return this.wdg6QnbFHrFF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        tl2.Companion.getClass();
        this.OPXfSBeufaJ8 = tl2.e9gEMXR7LXtO;
        e9gEMXR7LXtO(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof gr1) {
            return lS5Rgt96tfkO((gr1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof jp2) {
            return super.containsValue((jp2) obj);
        }
        return false;
    }

    public final void e9gEMXR7LXtO(int i) {
        this.x50lh2ztY7Y5 = i;
        this.dgRBjINgWbAK++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new nl1(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof gr1) {
            return (jp2) TSizfFm2Yiuu((gr1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof gr1) ? obj2 : (jp2) super.getOrDefault((gr1) obj, (jp2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new nl1(1, this);
    }

    public final boolean lS5Rgt96tfkO(Object obj) {
        return this.OPXfSBeufaJ8.Y1f8riQaR6yg(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.wdg6QnbFHrFF = null;
        this.OPXfSBeufaJ8 = this.OPXfSBeufaJ8.x50lh2ztY7Y5(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.wdg6QnbFHrFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [kl1] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        il1 il1Var = null;
        il1 il1Var2 = map instanceof kl1 ? (kl1) map : null;
        if (il1Var2 == null) {
            gl1 gl1Var = map instanceof gl1 ? (gl1) map : null;
            if (gl1Var != null) {
                il1Var = gl1Var.PxuCJdSBwIXG();
            }
        } else {
            il1Var = il1Var2;
        }
        if (il1Var == null) {
            super.putAll(map);
            return;
        }
        gy gyVar = new gy();
        gyVar.PxuCJdSBwIXG = 0;
        int i = this.x50lh2ztY7Y5;
        tl2 tl2Var = this.OPXfSBeufaJ8;
        tl2 tl2Var2 = il1Var.rtx2ld2ELZv4;
        tl2Var2.getClass();
        this.OPXfSBeufaJ8 = tl2Var.cpQdD2nAriOS(tl2Var2, 0, gyVar, this);
        int i2 = (il1Var.OPXfSBeufaJ8 + i) - gyVar.PxuCJdSBwIXG;
        if (i != i2) {
            e9gEMXR7LXtO(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        tl2 QrzZRwfaDlRX = this.OPXfSBeufaJ8.QrzZRwfaDlRX(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (QrzZRwfaDlRX == null) {
            tl2.Companion.getClass();
            QrzZRwfaDlRX = tl2.e9gEMXR7LXtO;
        }
        this.OPXfSBeufaJ8 = QrzZRwfaDlRX;
        return i != this.x50lh2ztY7Y5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.x50lh2ztY7Y5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new q41(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof gr1) {
            return (jp2) Y1f8riQaR6yg((gr1) obj);
        }
        return null;
    }
}
