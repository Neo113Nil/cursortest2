package okhttp3;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public interface Dns {
    public static final HttpUrl.Companion SYSTEM = new HttpUrl.Companion();

    List lookup(String str);
}
