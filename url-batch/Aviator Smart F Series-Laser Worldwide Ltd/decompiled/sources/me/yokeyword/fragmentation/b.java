package me.yokeyword.fragmentation;

/* loaded from: classes5.dex */
public class b {
    public static final int BUBBLE = 2;
    static volatile b INSTANCE = null;
    public static final int NONE = 0;
    public static final int SHAKE = 1;
    private boolean debug;
    private m6.a handler;
    private int mode;

    public static class a {
        private boolean debug;
        private m6.a handler;
        private int mode;

        static /* synthetic */ m6.a access$200(a aVar) {
            aVar.getClass();
            return null;
        }

        public a debug(boolean z7) {
            this.debug = z7;
            return this;
        }

        public a handleException(m6.a aVar) {
            return this;
        }

        public b install() {
            b.INSTANCE = new b(this);
            return b.INSTANCE;
        }

        public a stackViewMode(int i8) {
            this.mode = i8;
            return this;
        }
    }

    b(a aVar) {
        this.mode = 2;
        boolean z7 = aVar.debug;
        this.debug = z7;
        if (z7) {
            this.mode = aVar.mode;
        } else {
            this.mode = 0;
        }
        a.access$200(aVar);
    }

    public static a builder() {
        return new a();
    }

    public static b getDefault() {
        if (INSTANCE == null) {
            synchronized (b.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new b(new a());
                    }
                } finally {
                }
            }
        }
        return INSTANCE;
    }

    public m6.a getHandler() {
        return null;
    }

    public int getMode() {
        return this.mode;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public void setDebug(boolean z7) {
        this.debug = z7;
    }

    public void setHandler(m6.a aVar) {
    }

    public void setMode(int i8) {
        this.mode = i8;
    }
}
