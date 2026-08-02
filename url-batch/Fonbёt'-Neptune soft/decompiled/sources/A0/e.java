package A0;

import I.C0079n;
import K.k;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import s0.InterfaceC0304a;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public class e implements InterfaceC0304a {

    /* renamed from: e, reason: collision with root package name */
    public Context f65e;

    public final ArrayList a(d dVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f65e;
        switch (dVar.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case 2:
                str = "podcasts";
                break;
            case 3:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + dVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // s0.InterfaceC0304a
    public final void j(C0079n c0079n) {
        try {
            b.k((InterfaceC0320f) c0079n.f690f, this);
        } catch (Exception e2) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e2);
        }
        this.f65e = (Context) c0079n.f689e;
    }

    @Override // s0.InterfaceC0304a
    public final void k(C0079n c0079n) {
        b.k((InterfaceC0320f) c0079n.f690f, null);
    }
}
