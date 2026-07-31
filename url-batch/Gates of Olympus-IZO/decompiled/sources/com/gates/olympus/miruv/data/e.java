package com.gates.olympus.miruv.data;

import I2.l;
import L1.z;
import M1.B;
import M1.n;
import Z1.i;
import com.gates.olympus.miruv.data.db.GameStatDao;
import com.gates.olympus.miruv.data.db.GameStatEntity;
import com.gates.olympus.miruv.data.db.SavedJointDao;
import com.gates.olympus.miruv.data.db.SavedJointEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import n2.InterfaceC0700f;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class e {
    public static final int $stable = 8;
    private final List<com.gates.olympus.miruv.data.b> allJoints;
    private final SavedJointDao savedDao;
    private final InterfaceC0700f savedIds;
    private final GameStatDao statDao;
    private final InterfaceC0700f stats;

    public static final class a extends R1.c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(P1.d dVar) {
            super(dVar);
        }

        @Override // R1.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return e.this.recordGame(null, 0, this);
        }
    }

    public static final class b implements InterfaceC0700f {
        final /* synthetic */ InterfaceC0700f $this_unsafeTransform$inlined;

        public static final class a implements InterfaceC0701g {
            final /* synthetic */ InterfaceC0701g $this_unsafeFlow;

            /* renamed from: com.gates.olympus.miruv.data.e$b$a$a, reason: collision with other inner class name */
            public static final class C0000a extends R1.c {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0000a(P1.d dVar) {
                    super(dVar);
                }

                @Override // R1.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC0701g interfaceC0701g) {
                this.$this_unsafeFlow = interfaceC0701g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // n2.InterfaceC0701g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, P1.d dVar) {
                C0000a c0000a;
                int i3;
                if (dVar instanceof C0000a) {
                    c0000a = (C0000a) dVar;
                    int i4 = c0000a.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0000a.label = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0000a.result;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = c0000a.label;
                        if (i3 != 0) {
                            l.Q(obj2);
                            InterfaceC0701g interfaceC0701g = this.$this_unsafeFlow;
                            Set F02 = M1.l.F0((List) obj);
                            c0000a.label = 1;
                            if (interfaceC0701g.emit(F02, c0000a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l.Q(obj2);
                        }
                        return z.f2729a;
                    }
                }
                c0000a = new C0000a(dVar);
                Object obj22 = c0000a.result;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = c0000a.label;
                if (i3 != 0) {
                }
                return z.f2729a;
            }
        }

        public b(InterfaceC0700f interfaceC0700f) {
            this.$this_unsafeTransform$inlined = interfaceC0700f;
        }

        @Override // n2.InterfaceC0700f
        public Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new a(interfaceC0701g), dVar);
            return collect == Q1.a.f3113d ? collect : z.f2729a;
        }
    }

    public static final class c implements InterfaceC0700f {
        final /* synthetic */ InterfaceC0700f $this_unsafeTransform$inlined;

        public static final class a implements InterfaceC0701g {
            final /* synthetic */ InterfaceC0701g $this_unsafeFlow;

            /* renamed from: com.gates.olympus.miruv.data.e$c$a$a, reason: collision with other inner class name */
            public static final class C0001a extends R1.c {
                Object L$0;
                int label;
                /* synthetic */ Object result;

                public C0001a(P1.d dVar) {
                    super(dVar);
                }

                @Override // R1.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC0701g interfaceC0701g) {
                this.$this_unsafeFlow = interfaceC0701g;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // n2.InterfaceC0701g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, P1.d dVar) {
                C0001a c0001a;
                int i3;
                if (dVar instanceof C0001a) {
                    c0001a = (C0001a) dVar;
                    int i4 = c0001a.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0001a.label = i4 - Integer.MIN_VALUE;
                        Object obj2 = c0001a.result;
                        Q1.a aVar = Q1.a.f3113d;
                        i3 = c0001a.label;
                        if (i3 != 0) {
                            l.Q(obj2);
                            InterfaceC0701g interfaceC0701g = this.$this_unsafeFlow;
                            List<GameStatEntity> list = (List) obj;
                            int I3 = B.I(n.g0(list, 10));
                            if (I3 < 16) {
                                I3 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(I3);
                            for (GameStatEntity gameStatEntity : list) {
                                linkedHashMap.put(gameStatEntity.getGame(), new com.gates.olympus.miruv.data.a(gameStatEntity.getBestScore(), gameStatEntity.getLastScore(), gameStatEntity.getPlays()));
                            }
                            c0001a.label = 1;
                            if (interfaceC0701g.emit(linkedHashMap, c0001a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            l.Q(obj2);
                        }
                        return z.f2729a;
                    }
                }
                c0001a = new C0001a(dVar);
                Object obj22 = c0001a.result;
                Q1.a aVar2 = Q1.a.f3113d;
                i3 = c0001a.label;
                if (i3 != 0) {
                }
                return z.f2729a;
            }
        }

        public c(InterfaceC0700f interfaceC0700f) {
            this.$this_unsafeTransform$inlined = interfaceC0700f;
        }

        @Override // n2.InterfaceC0700f
        public Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
            Object collect = this.$this_unsafeTransform$inlined.collect(new a(interfaceC0701g), dVar);
            return collect == Q1.a.f3113d ? collect : z.f2729a;
        }
    }

    public e(SavedJointDao savedJointDao, GameStatDao gameStatDao) {
        i.f(savedJointDao, "savedDao");
        i.f(gameStatDao, "statDao");
        this.savedDao = savedJointDao;
        this.statDao = gameStatDao;
        this.allJoints = com.gates.olympus.miruv.data.c.INSTANCE.getJoints();
        this.savedIds = new b(savedJointDao.observeSavedIds());
        this.stats = new c(gameStatDao.observeAll());
    }

    public final List<com.gates.olympus.miruv.data.b> getAllJoints() {
        return this.allJoints;
    }

    public final InterfaceC0700f getSavedIds() {
        return this.savedIds;
    }

    public final InterfaceC0700f getStats() {
        return this.stats;
    }

    public final com.gates.olympus.miruv.data.b joint(String str) {
        i.f(str, "id");
        return com.gates.olympus.miruv.data.c.INSTANCE.byId(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object recordGame(String str, int i3, P1.d dVar) {
        a aVar;
        Q1.a aVar2;
        int i4;
        e eVar;
        GameStatDao gameStatDao;
        GameStatEntity gameStatEntity;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i5 = aVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aVar.label = i5 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                aVar2 = Q1.a.f3113d;
                i4 = aVar.label;
                if (i4 != 0) {
                    l.Q(obj);
                    GameStatDao gameStatDao2 = this.statDao;
                    aVar.L$0 = this;
                    aVar.L$1 = str;
                    aVar.I$0 = i3;
                    aVar.label = 1;
                    obj = gameStatDao2.get(str, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    eVar = this;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l.Q(obj);
                        return z.f2729a;
                    }
                    i3 = aVar.I$0;
                    str = (String) aVar.L$1;
                    eVar = (e) aVar.L$0;
                    l.Q(obj);
                }
                GameStatEntity gameStatEntity2 = (GameStatEntity) obj;
                int max = Math.max(i3, gameStatEntity2 == null ? gameStatEntity2.getBestScore() : 0);
                int plays = gameStatEntity2 != null ? gameStatEntity2.getPlays() : 0;
                gameStatDao = eVar.statDao;
                gameStatEntity = new GameStatEntity(str, max, i3, plays + 1);
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.label = 2;
                if (gameStatDao.upsert(gameStatEntity, aVar) == aVar2) {
                    return aVar2;
                }
                return z.f2729a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        aVar2 = Q1.a.f3113d;
        i4 = aVar.label;
        if (i4 != 0) {
        }
        GameStatEntity gameStatEntity22 = (GameStatEntity) obj2;
        int max2 = Math.max(i3, gameStatEntity22 == null ? gameStatEntity22.getBestScore() : 0);
        if (gameStatEntity22 != null) {
        }
        gameStatDao = eVar.statDao;
        gameStatEntity = new GameStatEntity(str, max2, i3, plays + 1);
        aVar.L$0 = null;
        aVar.L$1 = null;
        aVar.label = 2;
        if (gameStatDao.upsert(gameStatEntity, aVar) == aVar2) {
        }
        return z.f2729a;
    }

    public final Object toggleSaved(String str, boolean z3, P1.d dVar) {
        z zVar = z.f2729a;
        if (z3) {
            Object remove = this.savedDao.remove(str, dVar);
            return remove == Q1.a.f3113d ? remove : zVar;
        }
        Object add = this.savedDao.add(new SavedJointEntity(str, System.currentTimeMillis()), dVar);
        return add == Q1.a.f3113d ? add : zVar;
    }
}
