package k3;

import W1.m;
import android.util.Log;
import f2.i;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.d;
import kotlin.random.e;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0225a f41010g = new C0225a(null);

    /* renamed from: a, reason: collision with root package name */
    private final File f41011a;

    /* renamed from: b, reason: collision with root package name */
    private final File f41012b;

    /* renamed from: c, reason: collision with root package name */
    private final File f41013c;

    /* renamed from: d, reason: collision with root package name */
    private final File f41014d;

    /* renamed from: e, reason: collision with root package name */
    private volatile c f41015e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f41016f;

    /* renamed from: k3.a$a, reason: collision with other inner class name */
    public static final class C0225a {
        public /* synthetic */ C0225a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(k3.b bVar, String str, String str2) {
            int compareTo = bVar.c().compareTo(str);
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = bVar.d().compareTo(str2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return 0;
        }

        public static /* synthetic */ List d(C0225a c0225a, List list, Collection collection, int i4, int i5, Object obj) {
            if ((i5 & 4) != 0) {
                i4 = 15;
            }
            return c0225a.c(list, collection, i4);
        }

        private final void e(List list, k3.b bVar) {
            int binarySearch$default = CollectionsKt.binarySearch$default(list, bVar, b.f41017b, 0, 0, 12, null);
            if (binarySearch$default >= 0) {
                list.set(binarySearch$default, ((k3.b) list.get(binarySearch$default)).a(bVar.b()));
            } else {
                list.add((-binarySearch$default) - 1, bVar);
            }
        }

        public final List c(List sortedRecords, Collection withRecords, int i4) {
            Intrinsics.checkNotNullParameter(sortedRecords, "sortedRecords");
            Intrinsics.checkNotNullParameter(withRecords, "withRecords");
            if (i4 <= 0) {
                throw new IllegalStateException("maxRecordsCount <= 0");
            }
            if (sortedRecords.isEmpty()) {
                return CollectionsKt.sortedWith(withRecords, b.f41017b);
            }
            if (withRecords.isEmpty()) {
                return sortedRecords;
            }
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.addAll(sortedRecords);
            Iterator it = withRecords.iterator();
            while (it.hasNext()) {
                a.f41010g.e(createListBuilder, (k3.b) it.next());
            }
            if (createListBuilder.size() > i4) {
                Random a4 = d.a(e.f41170b);
                int i5 = 0;
                while (createListBuilder.size() > i4 - 1) {
                    i5 += ((k3.b) createListBuilder.remove(a4.nextInt(createListBuilder.size()))).b();
                }
                a.f41010g.e(createListBuilder, new k3.b("unknown", "max_size_exceeded", i5));
            }
            return CollectionsKt.build(createListBuilder);
        }

        private C0225a() {
        }
    }

    private static final class b implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public static final b f41017b = new b();

        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k3.b record, k3.b withRecord) {
            Intrinsics.checkNotNullParameter(record, "record");
            Intrinsics.checkNotNullParameter(withRecord, "withRecord");
            return a.f41010g.b(record, withRecord.c(), withRecord.d());
        }
    }

    private static abstract class c {

        /* renamed from: k3.a$c$a, reason: collision with other inner class name */
        public static final class C0226a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final List f41018a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0226a(List records) {
                super(null);
                Intrinsics.checkNotNullParameter(records, "records");
                this.f41018a = records;
            }

            public final List a() {
                return this.f41018a;
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41019a = new b();

            private b() {
                super(null);
            }
        }

        /* renamed from: k3.a$c$c, reason: collision with other inner class name */
        public static final class C0227c extends c {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference f41020a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0227c(List records) {
                super(null);
                Intrinsics.checkNotNullParameter(records, "records");
                this.f41020a = new WeakReference(records);
            }

            public final List a() {
                return (List) this.f41020a.get();
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f41011a = file;
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IllegalStateException(("File " + file + " not in directory").toString());
        }
        this.f41012b = parentFile;
        this.f41013c = i.o(parentFile, file.getName() + ".tmp");
        this.f41014d = i.o(parentFile, file.getName() + ".taken");
        this.f41015e = c.b.f41019a;
        this.f41016f = new Object();
    }

    private final List c() {
        if (!this.f41011a.exists()) {
            return CollectionsKt.emptyList();
        }
        try {
            return k3.c.f41024a.a(new JSONArray(i.e(this.f41011a, null, 1, null)));
        } catch (IOException e4) {
            Log.e("Tracer", "Couldn't read " + this.f41011a, e4);
            return CollectionsKt.emptyList();
        } catch (JSONException e5) {
            Log.e("Tracer", "Couldn't read " + this.f41011a, e5);
            try {
                n3.a.a(this.f41011a);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + this.f41011a);
            }
            return CollectionsKt.emptyList();
        }
    }

    private final void d(List list) {
        String jSONArray = k3.c.f41024a.b(list).toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "json.toString()");
        try {
            n3.a.b(this.f41012b);
            i.h(this.f41013c, jSONArray, null, 2, null);
            n3.a.c(this.f41013c, this.f41011a);
        } catch (IOException e4) {
            Log.e("Tracer", "Couldn't write " + this.f41011a, e4);
            try {
                n3.a.a(this.f41011a);
            } catch (IOException unused) {
                Log.e("Tracer", "Couldn't delete " + this.f41011a);
            }
        }
    }

    public final void a(String event, String reason, int i4) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(reason, "reason");
        b(CollectionsKt.listOf(new k3.b(event, reason, i4)));
    }

    public final void b(Collection records) {
        List emptyList;
        Intrinsics.checkNotNullParameter(records, "records");
        if (records.isEmpty()) {
            return;
        }
        synchronized (this.f41016f) {
            c cVar = this.f41015e;
            if ((cVar instanceof c.C0227c) && records == ((c.C0227c) cVar).a()) {
                this.f41012b.mkdirs();
                this.f41014d.renameTo(this.f41011a);
                this.f41015e = new c.C0226a((List) records);
                return;
            }
            c cVar2 = this.f41015e;
            if (cVar2 instanceof c.b) {
                emptyList = c();
            } else if (cVar2 instanceof c.C0226a) {
                emptyList = ((c.C0226a) cVar2).a();
            } else {
                if (!(cVar2 instanceof c.C0227c)) {
                    throw new m();
                }
                emptyList = CollectionsKt.emptyList();
            }
            List d4 = C0225a.d(f41010g, emptyList, records, 0, 4, null);
            d(d4);
            this.f41015e = new c.C0226a(d4);
            Unit unit = Unit.f41027a;
        }
    }

    public final Collection e() {
        List a4;
        c cVar = this.f41015e;
        if ((cVar instanceof c.C0226a) && ((c.C0226a) cVar).a().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        if (cVar instanceof c.C0227c) {
            return CollectionsKt.emptyList();
        }
        synchronized (this.f41016f) {
            try {
                c cVar2 = this.f41015e;
                if (cVar2 instanceof c.b) {
                    a4 = c();
                } else {
                    if (!(cVar2 instanceof c.C0226a)) {
                        if (!(cVar2 instanceof c.C0227c)) {
                            throw new m();
                        }
                        return CollectionsKt.emptyList();
                    }
                    a4 = ((c.C0226a) cVar2).a();
                }
                if (a4.isEmpty()) {
                    this.f41015e = new c.C0226a(CollectionsKt.emptyList());
                } else {
                    this.f41011a.renameTo(this.f41014d);
                    this.f41015e = new c.C0227c(a4);
                }
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
