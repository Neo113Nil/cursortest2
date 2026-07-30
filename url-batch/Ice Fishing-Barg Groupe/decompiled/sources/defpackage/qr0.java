package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qr0 extends yk {
    public final ac1 BRwzKIf41E4i;

    public qr0(Class cls) {
        super(true);
        this.BRwzKIf41E4i = new ac1(cls);
    }

    @Override // defpackage.dc1
    public final Object PxuCJdSBwIXG(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.yk
    public final /* bridge */ /* synthetic */ Object RAsUl2FVSrh6() {
        return p50.rtx2ld2ELZv4;
    }

    @Override // defpackage.dc1
    public final Object TSizfFm2Yiuu(Object obj, String str) {
        List list = (List) obj;
        ac1 ac1Var = this.BRwzKIf41E4i;
        return list != null ? zk.wcHq2YQJmeHg(list, fx1.jJwa0q7P5wHq(ac1Var.Y1f8riQaR6yg(str))) : fx1.jJwa0q7P5wHq(ac1Var.Y1f8riQaR6yg(str));
    }

    @Override // defpackage.dc1
    public final Object Y1f8riQaR6yg(String str) {
        return fx1.jJwa0q7P5wHq(this.BRwzKIf41E4i.Y1f8riQaR6yg(str));
    }

    @Override // defpackage.dc1
    public final void e9gEMXR7LXtO(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr0)) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.BRwzKIf41E4i, ((qr0) obj).BRwzKIf41E4i);
    }

    public final int hashCode() {
        return this.BRwzKIf41E4i.BRwzKIf41E4i.hashCode();
    }

    @Override // defpackage.dc1
    public final String lS5Rgt96tfkO() {
        return "List<" + this.BRwzKIf41E4i.XL4ISE6Oc65B.getName() + "}>";
    }

    @Override // defpackage.yk
    public final List rtx2ld2ELZv4(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return p50.rtx2ld2ELZv4;
        }
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }
}
