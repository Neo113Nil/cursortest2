package c2;

import b2.InterfaceC0265a;
import kotlin.jvm.internal.i;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279a implements InterfaceC0265a {
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private C0280b deviceLanguageProvider;

    public C0279a(com.onesignal.user.internal.properties.b _propertiesModelStore) {
        i.e(_propertiesModelStore, "_propertiesModelStore");
        this._propertiesModelStore = _propertiesModelStore;
        this.deviceLanguageProvider = new C0280b();
    }

    @Override // b2.InterfaceC0265a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // b2.InterfaceC0265a
    public void setLanguage(String value) {
        i.e(value, "value");
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(value);
    }
}
