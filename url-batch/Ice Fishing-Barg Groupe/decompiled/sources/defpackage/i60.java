package defpackage;

import java.io.IOException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class i60 implements ae0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4 = 0;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ i60(int i, String str, j60 j60Var) {
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = str;
        this.dgRBjINgWbAK = j60Var;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.dgRBjINgWbAK;
        int i2 = this.OPXfSBeufaJ8;
        Object obj2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                String str = (String) obj2;
                j60 j60Var = (j60) obj;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    serialDescriptorArr[i3] = kj0.cpQdD2nAriOS(str + '.' + j60Var.e9gEMXR7LXtO[i3], wa2.rtx2ld2ELZv4, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            default:
                ll0 ll0Var = (ll0) obj2;
                try {
                    ll0Var.rZjpSjn4zoMv.RfyTYNmI9Srp(i2, (o60) obj);
                } catch (IOException e) {
                    o60 o60Var = o60.wdg6QnbFHrFF;
                    ll0Var.lS5Rgt96tfkO(o60Var, o60Var, e);
                }
                return no2.PxuCJdSBwIXG;
        }
    }

    public /* synthetic */ i60(ll0 ll0Var, int i, o60 o60Var) {
        this.wdg6QnbFHrFF = ll0Var;
        this.OPXfSBeufaJ8 = i;
        this.dgRBjINgWbAK = o60Var;
    }
}
