package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class th implements Runnable {
    public final int OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public th(List list, int i, Throwable th) {
        this.rtx2ld2ELZv4 = 1;
        ki0.RfyTYNmI9Srp(list, "initCallbacks cannot be null");
        this.wdg6QnbFHrFF = new ArrayList(list);
        this.OPXfSBeufaJ8 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.rtx2ld2ELZv4;
        int i2 = this.OPXfSBeufaJ8;
        Object obj = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ow owVar = (ow) arrayList.get(i3);
                        owVar.PxuCJdSBwIXG.setValue(Boolean.TRUE);
                        owVar.lS5Rgt96tfkO.OPXfSBeufaJ8 = new mn0(true);
                        i3++;
                    }
                    break;
                } else {
                    while (i3 < size) {
                        ((ow) arrayList.get(i3)).lS5Rgt96tfkO.OPXfSBeufaJ8 = ov2.RAsUl2FVSrh6;
                        i3++;
                    }
                    break;
                }
            default:
                ((uv2) obj).OPXfSBeufaJ8(i2);
                break;
        }
    }

    public /* synthetic */ th(int i, int i2, Object obj) {
        this.rtx2ld2ELZv4 = i2;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = i;
    }
}
