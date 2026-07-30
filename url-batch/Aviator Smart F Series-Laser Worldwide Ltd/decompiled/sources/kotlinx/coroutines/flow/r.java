package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public interface r {
    public static final a Companion = a.$$INSTANCE;

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();
        private static final r Eagerly = new s();
        private static final r Lazily = new StartedLazily();

        private a() {
        }

        public static /* synthetic */ r WhileSubscribed$default(a aVar, long j8, long j9, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                j8 = 0;
            }
            if ((i8 & 2) != 0) {
                j9 = Long.MAX_VALUE;
            }
            return aVar.WhileSubscribed(j8, j9);
        }

        public final r WhileSubscribed(long j8, long j9) {
            return new StartedWhileSubscribed(j8, j9);
        }

        public final r getEagerly() {
            return Eagerly;
        }

        public final r getLazily() {
            return Lazily;
        }
    }

    e command(t tVar);
}
