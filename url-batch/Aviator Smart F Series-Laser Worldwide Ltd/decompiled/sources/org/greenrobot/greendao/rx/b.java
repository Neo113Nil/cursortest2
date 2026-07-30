package org.greenrobot.greendao.rx;

import java.util.List;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

/* loaded from: classes5.dex */
public class b extends org.greenrobot.greendao.rx.a {
    private final org.greenrobot.greendao.a dao;

    class a implements Callable {
        final /* synthetic */ Object val$entity;

        a(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            b.this.dao.save(this.val$entity);
            return this.val$entity;
        }
    }

    /* renamed from: org.greenrobot.greendao.rx.b$b, reason: collision with other inner class name */
    class CallableC0400b implements Callable {
        final /* synthetic */ Iterable val$entities;

        CallableC0400b(Iterable iterable) {
            this.val$entities = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Iterable<Object> call() {
            b.this.dao.saveInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class c implements Callable {
        final /* synthetic */ Object[] val$entities;

        c(Object[] objArr) {
            this.val$entities = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Object[] call() {
            b.this.dao.saveInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class d implements Callable {
        final /* synthetic */ Object val$entity;

        d(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            b.this.dao.update(this.val$entity);
            return this.val$entity;
        }
    }

    class e implements Callable {
        final /* synthetic */ Iterable val$entities;

        e(Iterable iterable) {
            this.val$entities = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Iterable<Object> call() {
            b.this.dao.updateInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class f implements Callable {
        final /* synthetic */ Object[] val$entities;

        f(Object[] objArr) {
            this.val$entities = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Object[] call() {
            b.this.dao.updateInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class g implements Callable {
        final /* synthetic */ Object val$entity;

        g(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.delete(this.val$entity);
            return null;
        }
    }

    class h implements Callable {
        final /* synthetic */ Object val$key;

        h(Object obj) {
            this.val$key = obj;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteByKey(this.val$key);
            return null;
        }
    }

    class i implements Callable {
        i() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteAll();
            return null;
        }
    }

    class j implements Callable {
        final /* synthetic */ Iterable val$entities;

        j(Iterable iterable) {
            this.val$entities = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteInTx(this.val$entities);
            return null;
        }
    }

    class k implements Callable {
        k() {
        }

        @Override // java.util.concurrent.Callable
        public List<Object> call() {
            return b.this.dao.loadAll();
        }
    }

    class l implements Callable {
        final /* synthetic */ Object[] val$entities;

        l(Object[] objArr) {
            this.val$entities = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteInTx(this.val$entities);
            return null;
        }
    }

    class m implements Callable {
        final /* synthetic */ Iterable val$keys;

        m(Iterable iterable) {
            this.val$keys = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteByKeyInTx(this.val$keys);
            return null;
        }
    }

    class n implements Callable {
        final /* synthetic */ Object[] val$keys;

        n(Object[] objArr) {
            this.val$keys = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            b.this.dao.deleteByKeyInTx(this.val$keys);
            return null;
        }
    }

    class o implements Callable {
        o() {
        }

        @Override // java.util.concurrent.Callable
        public Long call() {
            return Long.valueOf(b.this.dao.count());
        }
    }

    class p implements Callable {
        final /* synthetic */ Object val$key;

        p(Object obj) {
            this.val$key = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return b.this.dao.load(this.val$key);
        }
    }

    class q implements Callable {
        final /* synthetic */ Object val$entity;

        q(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            b.this.dao.refresh(this.val$entity);
            return this.val$entity;
        }
    }

    class r implements Callable {
        final /* synthetic */ Object val$entity;

        r(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            b.this.dao.insert(this.val$entity);
            return this.val$entity;
        }
    }

    class s implements Callable {
        final /* synthetic */ Iterable val$entities;

        s(Iterable iterable) {
            this.val$entities = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Iterable<Object> call() {
            b.this.dao.insertInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class t implements Callable {
        final /* synthetic */ Object[] val$entities;

        t(Object[] objArr) {
            this.val$entities = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Object[] call() {
            b.this.dao.insertInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class u implements Callable {
        final /* synthetic */ Object val$entity;

        u(Object obj) {
            this.val$entity = obj;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            b.this.dao.insertOrReplace(this.val$entity);
            return this.val$entity;
        }
    }

    class v implements Callable {
        final /* synthetic */ Iterable val$entities;

        v(Iterable iterable) {
            this.val$entities = iterable;
        }

        @Override // java.util.concurrent.Callable
        public Iterable<Object> call() {
            b.this.dao.insertOrReplaceInTx(this.val$entities);
            return this.val$entities;
        }
    }

    class w implements Callable {
        final /* synthetic */ Object[] val$entities;

        w(Object[] objArr) {
            this.val$entities = objArr;
        }

        @Override // java.util.concurrent.Callable
        public Object[] call() {
            b.this.dao.insertOrReplaceInTx(this.val$entities);
            return this.val$entities;
        }
    }

    public b(org.greenrobot.greendao.a aVar) {
        this(aVar, null);
    }

    public Observable<Long> count() {
        return wrap(new o());
    }

    public Observable<Void> delete(Object obj) {
        return wrap(new g(obj));
    }

    public Observable<Void> deleteAll() {
        return wrap(new i());
    }

    public Observable<Void> deleteByKey(Object obj) {
        return wrap(new h(obj));
    }

    public Observable<Void> deleteByKeyInTx(Iterable<Object> iterable) {
        return wrap(new m(iterable));
    }

    public Observable<Void> deleteInTx(Iterable<Object> iterable) {
        return wrap(new j(iterable));
    }

    public org.greenrobot.greendao.a getDao() {
        return this.dao;
    }

    @Override // org.greenrobot.greendao.rx.a
    public /* bridge */ /* synthetic */ Scheduler getScheduler() {
        return super.getScheduler();
    }

    public Observable<Object> insert(Object obj) {
        return wrap(new r(obj));
    }

    public Observable<Iterable<Object>> insertInTx(Iterable<Object> iterable) {
        return wrap(new s(iterable));
    }

    public Observable<Object> insertOrReplace(Object obj) {
        return wrap(new u(obj));
    }

    public Observable<Iterable<Object>> insertOrReplaceInTx(Iterable<Object> iterable) {
        return wrap(new v(iterable));
    }

    public Observable<Object> load(Object obj) {
        return wrap(new p(obj));
    }

    public Observable<List<Object>> loadAll() {
        return wrap(new k());
    }

    public Observable<Object> refresh(Object obj) {
        return wrap(new q(obj));
    }

    public Observable<Object> save(Object obj) {
        return wrap(new a(obj));
    }

    public Observable<Iterable<Object>> saveInTx(Iterable<Object> iterable) {
        return wrap(new CallableC0400b(iterable));
    }

    public Observable<Object> update(Object obj) {
        return wrap(new d(obj));
    }

    public Observable<Iterable<Object>> updateInTx(Iterable<Object> iterable) {
        return wrap(new e(iterable));
    }

    public b(org.greenrobot.greendao.a aVar, Scheduler scheduler) {
        super(scheduler);
        this.dao = aVar;
    }

    public Observable<Void> deleteByKeyInTx(Object... objArr) {
        return wrap(new n(objArr));
    }

    public Observable<Void> deleteInTx(Object... objArr) {
        return wrap(new l(objArr));
    }

    public Observable<Object[]> insertInTx(Object... objArr) {
        return wrap(new t(objArr));
    }

    public Observable<Object[]> insertOrReplaceInTx(Object... objArr) {
        return wrap(new w(objArr));
    }

    public Observable<Object[]> saveInTx(Object... objArr) {
        return wrap(new c(objArr));
    }

    public Observable<Object[]> updateInTx(Object... objArr) {
        return wrap(new f(objArr));
    }
}
