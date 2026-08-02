package y0;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface q {
    n[] b();

    default n[] c(Uri uri, Map map) {
        return b();
    }
}
