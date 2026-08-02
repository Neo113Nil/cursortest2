package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ato extends alk {
    public static final ato c = new ato();

    private ato() {
        super(12, 13);
    }

    @Override // defpackage.alk
    public final void a(amj amjVar) {
        amjVar.e("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        amjVar.e("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
