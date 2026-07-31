package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFa1cSDK;", "", "Landroid/content/Context;", "p0", "", "", "values", "(Landroid/content/Context;)Ljava/util/Map;", "AFa1ySDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AFa1cSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.valueOf;

    Map<String, String> values(Context p0);

    /* renamed from: com.appsflyer.internal.AFa1cSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion valueOf = new Companion();

        private Companion() {
        }
    }
}
