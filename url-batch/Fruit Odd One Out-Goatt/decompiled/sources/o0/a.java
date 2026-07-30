package o0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.PointerIcon;
import e0.i0;
import e0.u;
import java.util.Locale;
import n1.d;
import t0.g;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1014a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1015b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f1014a = i2;
        this.f1015b = obj;
    }

    public void a(String str) {
        p0.a aVar = (p0.a) ((c0.a) this.f1015b).f66c;
        if (c0.a.f64g == null) {
            i0 i0Var = new i0();
            i0Var.put("alias", 1010);
            i0Var.put("allScroll", 1013);
            i0Var.put("basic", 1000);
            i0Var.put("cell", 1006);
            i0Var.put("click", 1002);
            i0Var.put("contextMenu", 1001);
            i0Var.put("copy", 1011);
            i0Var.put("forbidden", 1012);
            i0Var.put("grab", 1020);
            i0Var.put("grabbing", 1021);
            i0Var.put("help", 1003);
            i0Var.put("move", 1013);
            i0Var.put("none", 0);
            i0Var.put("noDrop", 1012);
            i0Var.put("precise", 1007);
            i0Var.put("text", 1008);
            i0Var.put("resizeColumn", 1014);
            i0Var.put("resizeDown", 1015);
            i0Var.put("resizeUpLeft", 1016);
            i0Var.put("resizeDownRight", 1017);
            i0Var.put("resizeLeft", 1014);
            i0Var.put("resizeLeftRight", 1014);
            i0Var.put("resizeRight", 1014);
            i0Var.put("resizeRow", 1015);
            i0Var.put("resizeUp", 1015);
            i0Var.put("resizeUpDown", 1015);
            i0Var.put("resizeUpLeft", 1017);
            i0Var.put("resizeUpRight", 1016);
            i0Var.put("resizeUpLeftDownRight", 1017);
            i0Var.put("resizeUpRightDownLeft", 1016);
            i0Var.put("verticalText", 1009);
            i0Var.put("wait", 1004);
            i0Var.put("zoomIn", 1018);
            i0Var.put("zoomOut", 1019);
            c0.a.f64g = i0Var;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((u) aVar).getContext(), ((Integer) c0.a.f64g.getOrDefault(str, 1000)).intValue()));
    }

    @Override // n1.d
    public Object b(Object obj, x0.b bVar) {
        ((k.a) this.f1015b).accept(obj);
        return g.f1178a;
    }

    public String c(String str, String str2) {
        Context context;
        Context context2 = ((b) this.f1015b).f1017b;
        if (str2 != null) {
            Locale a2 = b.a(str2);
            Configuration configuration = new Configuration(context2.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = context2.createConfigurationContext(configuration);
        } else {
            context = context2;
        }
        int identifier = context.getResources().getIdentifier(str, "string", context2.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public String toString() {
        switch (this.f1014a) {
            case 2:
                return "<" + ((String) this.f1015b) + '>';
            default:
                return super.toString();
        }
    }
}
