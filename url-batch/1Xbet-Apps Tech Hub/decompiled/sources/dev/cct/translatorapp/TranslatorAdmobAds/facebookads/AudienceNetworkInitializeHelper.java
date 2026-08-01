package dev.cct.translatorapp.TranslatorAdmobAds.facebookads;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AudienceNetworkInitializeHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/AudienceNetworkInitializeHelper;", "Lcom/facebook/ads/AudienceNetworkAds$InitListener;", "()V", "onInitialized", "", "p0", "Lcom/facebook/ads/AudienceNetworkAds$InitResult;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudienceNetworkInitializeHelper implements AudienceNetworkAds.InitListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult p0) {
        Log.d("ContentValues", (p0 != null ? p0.getMessage() : null));
    }

    /* compiled from: AudienceNetworkInitializeHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/AudienceNetworkInitializeHelper$Companion;", "", "()V", "initialize", "", "context", "Landroid/content/Context;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void initialize(Context context) {
            if (AudienceNetworkAds.isInitialized(context)) {
                return;
            }
            AudienceNetworkAds.buildInitSettings(context).withInitListener(new AudienceNetworkInitializeHelper()).initialize();
        }
    }
}
