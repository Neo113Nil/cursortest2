package u0;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8068a;

    public v(ArrayList arrayList) {
        this.f8068a = arrayList;
    }

    public final WebResourceResponse a(Uri uri) {
        WebResourceResponse webResourceResponse;
        ArrayList arrayList = this.f8068a;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            webResourceResponse = null;
            r3 = null;
            r3 = null;
            r3 = null;
            t tVar = null;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            u uVar = (u) obj;
            uVar.getClass();
            String str = uVar.f8066c;
            if ((!uri.getScheme().equals("http") || uVar.f8064a) && ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(uVar.f8065b) && uri.getPath().startsWith(str))) {
                tVar = uVar.f8067d;
            }
            if (tVar != null && (webResourceResponse = tVar.handle(uri.getPath().replaceFirst(str, ""))) != null) {
                break;
            }
        }
        return webResourceResponse;
    }
}
