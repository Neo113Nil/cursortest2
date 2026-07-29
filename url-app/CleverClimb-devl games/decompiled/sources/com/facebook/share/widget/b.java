package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.h;
import com.facebook.internal.e;
import com.facebook.internal.i;
import com.facebook.share.internal.l;
import com.facebook.share.internal.m;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GameRequestDialog.java */
/* loaded from: classes.dex */
public class b extends i<GameRequestContent, a> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6423b = e.b.GameRequest.a();

    /* compiled from: GameRequestDialog.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f6428a;

        /* renamed from: b, reason: collision with root package name */
        List<String> f6429b;

        private a(Bundle bundle) {
            this.f6428a = bundle.getString("request");
            this.f6429b = new ArrayList();
            while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(this.f6429b.size())))) {
                this.f6429b.add(bundle.getString(String.format("to[%d]", Integer.valueOf(this.f6429b.size()))));
            }
        }
    }

    public static void a(Activity activity, GameRequestContent gameRequestContent) {
        new b(activity).b(gameRequestContent);
    }

    public b(Activity activity) {
        super(activity, f6423b);
    }

    @Override // com.facebook.internal.i
    protected void a(com.facebook.internal.e eVar, final h<a> hVar) {
        final com.facebook.share.internal.i iVar = hVar == null ? null : new com.facebook.share.internal.i(hVar) { // from class: com.facebook.share.widget.b.1
            @Override // com.facebook.share.internal.i
            public void a(com.facebook.internal.a aVar, Bundle bundle) {
                if (bundle != null) {
                    hVar.a((h) new a(bundle));
                } else {
                    a(aVar);
                }
            }
        };
        eVar.b(a(), new e.a() { // from class: com.facebook.share.widget.b.2
            @Override // com.facebook.internal.e.a
            public boolean a(int i, Intent intent) {
                return l.a(b.this.a(), i, intent, iVar);
            }
        });
    }

    @Override // com.facebook.internal.i
    protected com.facebook.internal.a d() {
        return new com.facebook.internal.a(a());
    }

    @Override // com.facebook.internal.i
    protected List<i<GameRequestContent, a>.a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0365b());
        return arrayList;
    }

    /* compiled from: GameRequestDialog.java */
    /* renamed from: com.facebook.share.widget.b$b, reason: collision with other inner class name */
    private class C0365b extends i<GameRequestContent, a>.a {
        @Override // com.facebook.internal.i.a
        public boolean a(GameRequestContent gameRequestContent, boolean z) {
            return true;
        }

        private C0365b() {
            super();
        }

        @Override // com.facebook.internal.i.a
        public com.facebook.internal.a a(GameRequestContent gameRequestContent) {
            com.facebook.share.internal.b.a(gameRequestContent);
            com.facebook.internal.a d2 = b.this.d();
            com.facebook.internal.h.a(d2, "apprequests", m.a(gameRequestContent));
            return d2;
        }
    }
}
