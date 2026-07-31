package com.ironsource;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public interface tf {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<zb> f19751a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19752b;

        /* renamed from: c, reason: collision with root package name */
        private int f19753c;

        /* renamed from: d, reason: collision with root package name */
        private Exception f19754d;

        public a(ArrayList<zb> arrayList) {
            this.f19752b = false;
            this.f19753c = -1;
            this.f19751a = arrayList;
        }

        public a a(int i4) {
            return new a(this.f19751a, i4, this.f19752b, this.f19754d);
        }

        public ArrayList<zb> b() {
            return this.f19751a;
        }

        public boolean c() {
            return this.f19752b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f19752b + ", responseCode=" + this.f19753c + ", exception=" + this.f19754d + '}';
        }

        a(ArrayList<zb> arrayList, int i4, boolean z4, Exception exc) {
            this.f19751a = arrayList;
            this.f19752b = z4;
            this.f19754d = exc;
            this.f19753c = i4;
        }

        public a a(Exception exc) {
            return new a(this.f19751a, this.f19753c, this.f19752b, exc);
        }

        public a a(boolean z4) {
            return new a(this.f19751a, this.f19753c, z4, this.f19754d);
        }

        public String a() {
            if (this.f19752b) {
                return "";
            }
            return "rc=" + this.f19753c + ", ex=" + this.f19754d;
        }
    }

    void a(a aVar);
}
