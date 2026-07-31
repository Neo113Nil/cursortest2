package androidx.core.net;

import android.net.Uri;
import com.ironsource.B5;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MailTo {
    private HashMap mHeaders;

    public String toString() {
        StringBuilder sb = new StringBuilder("mailto:");
        sb.append('?');
        for (Map.Entry entry : this.mHeaders.entrySet()) {
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append(B5.U);
            sb.append(Uri.encode((String) entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
