package c;

import android.os.Parcelable;
import d.AbstractC0105a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102i extends AbstractC0096c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0103j f1657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0105a f1659c;

    public C0102i(AbstractC0103j abstractC0103j, String str, AbstractC0105a abstractC0105a) {
        this.f1657a = abstractC0103j;
        this.f1658b = str;
        this.f1659c = abstractC0105a;
    }

    public final void a(Object obj) {
        AbstractC0103j abstractC0103j = this.f1657a;
        LinkedHashMap linkedHashMap = abstractC0103j.f1661b;
        String str = this.f1658b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC0105a abstractC0105a = this.f1659c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0105a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = abstractC0103j.f1663d;
        arrayList.add(str);
        try {
            abstractC0103j.b(intValue, abstractC0105a, (Parcelable) obj);
        } catch (Exception e2) {
            arrayList.remove(str);
            throw e2;
        }
    }
}
