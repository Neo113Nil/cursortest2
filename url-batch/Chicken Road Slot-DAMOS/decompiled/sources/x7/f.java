package x7;

import z7.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends o7.g {

    /* renamed from: e, reason: collision with root package name */
    public final o f10529e;

    /* renamed from: f, reason: collision with root package name */
    public final w7.g f10530f;
    public final /* synthetic */ g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, w7.g gVar2) {
        super(2);
        this.g = gVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f10529e = new o("OnRequestIntegrityTokenCallback");
        this.f10530f = gVar2;
    }
}
