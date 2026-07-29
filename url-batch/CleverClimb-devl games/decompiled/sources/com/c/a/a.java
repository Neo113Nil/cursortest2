package com.c.a;

import java.util.ArrayList;

/* compiled from: Animator.java */
/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    ArrayList<InterfaceC0316a> f3524a = null;

    /* compiled from: Animator.java */
    /* renamed from: com.c.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0316a {
        void a(a aVar);

        void b(a aVar);

        void c(a aVar);

        void d(a aVar);
    }

    public void a() {
    }

    public void b() {
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            if (this.f3524a != null) {
                ArrayList<InterfaceC0316a> arrayList = this.f3524a;
                aVar.f3524a = new ArrayList<>();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aVar.f3524a.add(arrayList.get(i));
                }
            }
            return aVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
