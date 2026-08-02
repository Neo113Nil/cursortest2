package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ajv extends kso implements krx {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajv(Object obj, int i) {
        super(2, obj, ajz.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.a = i;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            return ajz.b((ajw) this.c, (krt) obj, (kqj) obj2);
        }
        if (i == 1) {
            return ajz.b((ajw) this.c, (krt) obj, (kqj) obj2);
        }
        if (i == 2) {
            return ((exg) this.c).b((exd) obj);
        }
        if (i == 3) {
            return ((exg) this.c).a((ewz) obj, (kqj) obj2);
        }
        return ((exg) this.c).c((exb) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajv(Object obj, int i, char[] cArr) {
        super(2, obj, exg.class, "handshake", "handshake(Lcom/google/android/libraries/restore/osmigration/systemappapi/proto/TargetHandshakeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajv(Object obj, int i, short[] sArr) {
        super(2, obj, exg.class, "importItem", "importItem(Lcom/google/android/libraries/restore/osmigration/systemappapi/proto/ImportItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajv(Object obj, int i, int[] iArr) {
        super(2, obj, exg.class, "importItemsDone", "importItemsDone(Lcom/google/android/libraries/restore/osmigration/systemappapi/proto/ImportItemsDoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
    }
}
