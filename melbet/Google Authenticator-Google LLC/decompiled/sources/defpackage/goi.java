package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class goi implements hac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ goi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hac
    public final Object bB() {
        int i = this.b;
        if (i == 0) {
            fdx c = ((fee) ((iwq) this.a).d).c("/client_streamz/tiktok/work/worker/duration", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("worker_permanent_tag", String.class), new fdz("status", String.class));
            c.c();
            return c;
        }
        if (i == 1) {
            fea e = ((fee) ((iwq) this.a).d).e("/client_streamz/tiktok/work/worker/count", new fdz("app_package", String.class), new fdz("process_name", String.class), new fdz("worker_permanent_tag", String.class), new fdz("status", String.class));
            e.c();
            return e;
        }
        if (i == 2) {
            return new gwz((gva) this.a);
        }
        gzl gzlVar = igg.a;
        return (Boolean) ((bnu) this.a).a().d(false);
    }
}
