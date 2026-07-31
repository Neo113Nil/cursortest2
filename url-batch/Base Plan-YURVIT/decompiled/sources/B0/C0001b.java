package B0;

import F.C0032n;
import a.AbstractC0086a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import r0.InterfaceC0225a;
import v0.C0244i;
import v0.InterfaceC0237b;
import v0.InterfaceC0241f;

/* renamed from: B0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0001b implements InterfaceC0225a {

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f70e;

    /* renamed from: f, reason: collision with root package name */
    public final C0000a f71f = new C0000a(0);

    public static void e(InterfaceC0241f interfaceC0241f, final C0001b c0001b) {
        C0000a g2 = interfaceC0241f.g(new C0244i());
        C0002c c0002c = C0002c.f72e;
        C0032n c0032n = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0002c, g2);
        if (c0001b != null) {
            final int i2 = 0;
            c0032n.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i2) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n.j(null);
        }
        C0032n c0032n2 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0002c, g2);
        if (c0001b != null) {
            final int i3 = 1;
            c0032n2.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i3) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n2.j(null);
        }
        C0032n c0032n3 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0002c, g2);
        if (c0001b != null) {
            final int i4 = 2;
            c0032n3.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i4) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n3.j(null);
        }
        C0032n c0032n4 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0002c, g2);
        if (c0001b != null) {
            final int i5 = 3;
            c0032n4.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i5) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n4.j(null);
        }
        C0032n c0032n5 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0002c, g2);
        if (c0001b != null) {
            final int i6 = 4;
            c0032n5.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i6) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n5.j(null);
        }
        C0032n c0032n6 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0002c, g2);
        if (c0001b != null) {
            final int i7 = 5;
            c0032n6.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i7) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n6.j(null);
        }
        C0032n c0032n7 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0002c, g2);
        if (c0001b != null) {
            final int i8 = 6;
            c0032n7.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i8) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n7.j(null);
        }
        C0032n c0032n8 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0002c, g2);
        if (c0001b != null) {
            final int i9 = 7;
            c0032n8.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i9) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0032n8.j(null);
        }
        C0032n c0032n9 = new C0032n(interfaceC0241f, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0002c, g2);
        if (c0001b == null) {
            c0032n9.j(null);
        } else {
            final int i10 = 8;
            c0032n9.j(new InterfaceC0237b(c0001b) { // from class: B0.d

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ C0001b f75f;

                {
                    this.f75f = c0001b;
                }

                @Override // v0.InterfaceC0237b
                public final void a(Object obj, N.P p2) {
                    switch (i10) {
                        case 0:
                            C0001b c0001b2 = this.f75f;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0001b2.f70e.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.M(th);
                            }
                            p2.n(arrayList);
                            break;
                        case 1:
                            C0001b c0001b3 = this.f75f;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0001b3.f70e.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0086a.M(th2);
                            }
                            p2.n(arrayList2);
                            break;
                        case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                            C0001b c0001b4 = this.f75f;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0001b4.d((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0086a.M(th3);
                            }
                            p2.n(arrayList4);
                            break;
                        case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0001b c0001b5 = this.f75f;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0001b5.f70e.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0086a.M(th4);
                            }
                            p2.n(arrayList6);
                            break;
                        case H.k.LONG_FIELD_NUMBER /* 4 */:
                            C0001b c0001b6 = this.f75f;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                c0001b6.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(c0001b6.f70e.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0086a.M(th5);
                            }
                            p2.n(arrayList8);
                            break;
                        case H.k.STRING_FIELD_NUMBER /* 5 */:
                            C0001b c0001b7 = this.f75f;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0001b7.f70e.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0086a.M(th6);
                            }
                            p2.n(arrayList10);
                            break;
                        case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0001b c0001b8 = this.f75f;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(c0001b8.f70e.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0001b8.f71f.d(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0086a.M(th7);
                            }
                            p2.n(arrayList12);
                            break;
                        case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0001b c0001b9 = this.f75f;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0001b9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0086a.M(th8);
                            }
                            p2.n(arrayList14);
                            break;
                        default:
                            C0001b c0001b10 = this.f75f;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0001b10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0086a.M(th9);
                            }
                            p2.n(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f70e.edit();
        Map<String, ?> all = this.f70e.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            edit.remove((String) obj);
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        Object obj;
        Set hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.f70e.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z2 = obj2 instanceof String;
                C0000a c0000a = this.f71f;
                if (z2) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = c0000a.c(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.f70e.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0000a.d(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // r0.InterfaceC0225a
    public final void c(N.P p2) {
        InterfaceC0241f interfaceC0241f = (InterfaceC0241f) p2.f699g;
        this.f70e = ((Context) p2.f698f).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            e(interfaceC0241f, this);
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }

    public final Boolean d(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f70e.edit().putString(str, str2).commit());
    }

    @Override // r0.InterfaceC0225a
    public final void i(N.P p2) {
        e((InterfaceC0241f) p2.f699g, null);
    }
}
