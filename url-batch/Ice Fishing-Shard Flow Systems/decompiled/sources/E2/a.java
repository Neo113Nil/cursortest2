package E2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements D2.a {
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(com.onesignal.user.internal.properties.b _propertiesModelStore) {
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new b();
    }

    @Override // D2.a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // D2.a
    public void setLanguage(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(value);
    }
}
