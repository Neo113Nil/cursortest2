package ma;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements la.a {
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private b deviceLanguageProvider;

    public a(com.onesignal.user.internal.properties.b bVar) {
        bVar.getClass();
        this._propertiesModelStore = bVar;
        this.deviceLanguageProvider = new b();
    }

    @Override // la.a
    public String getLanguage() {
        String language = ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).getLanguage();
        return language == null ? this.deviceLanguageProvider.getLanguage() : language;
    }

    @Override // la.a
    public void setLanguage(String str) {
        str.getClass();
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setLanguage(str);
    }
}
