package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GraphRequestBatch.java */
/* loaded from: classes.dex */
public class p extends AbstractList<GraphRequest> {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicInteger f6325a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private Handler f6326b;

    /* renamed from: c, reason: collision with root package name */
    private List<GraphRequest> f6327c;

    /* renamed from: d, reason: collision with root package name */
    private int f6328d = 0;
    private final String e = Integer.valueOf(f6325a.incrementAndGet()).toString();
    private List<a> f = new ArrayList();
    private String g;

    /* compiled from: GraphRequestBatch.java */
    public interface a {
        void a(p pVar);
    }

    /* compiled from: GraphRequestBatch.java */
    public interface b extends a {
        void a(p pVar, long j, long j2);
    }

    public p() {
        this.f6327c = new ArrayList();
        this.f6327c = new ArrayList();
    }

    public p(Collection<GraphRequest> collection) {
        this.f6327c = new ArrayList();
        this.f6327c = new ArrayList(collection);
    }

    public p(GraphRequest... graphRequestArr) {
        this.f6327c = new ArrayList();
        this.f6327c = Arrays.asList(graphRequestArr);
    }

    public int a() {
        return this.f6328d;
    }

    public void a(a aVar) {
        if (this.f.contains(aVar)) {
            return;
        }
        this.f.add(aVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean add(GraphRequest graphRequest) {
        return this.f6327c.add(graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void add(int i, GraphRequest graphRequest) {
        this.f6327c.add(i, graphRequest);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f6327c.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GraphRequest get(int i) {
        return this.f6327c.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final GraphRequest remove(int i) {
        return this.f6327c.remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return this.f6327c.set(i, graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6327c.size();
    }

    final String b() {
        return this.e;
    }

    final Handler c() {
        return this.f6326b;
    }

    final void a(Handler handler) {
        this.f6326b = handler;
    }

    final List<GraphRequest> d() {
        return this.f6327c;
    }

    final List<a> e() {
        return this.f;
    }

    public final String f() {
        return this.g;
    }

    public final List<q> g() {
        return i();
    }

    public final o h() {
        return j();
    }

    List<q> i() {
        return GraphRequest.b(this);
    }

    o j() {
        return GraphRequest.c(this);
    }
}
