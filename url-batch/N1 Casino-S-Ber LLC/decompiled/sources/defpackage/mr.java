package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class mr implements r10, bs, ix, g9, s0 {
    public Object f;

    public /* synthetic */ mr(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.s0
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.e;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = x80.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        n7 n7Var = swipeDismissBehavior.b;
        if (n7Var != null) {
            n7Var.a(view);
        }
        return true;
    }

    @Override // defpackage.ix
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.ix
    public void c(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    public void d(String str) {
        int size;
        str.getClass();
        ArrayList arrayList = new ArrayList(e());
        int size2 = arrayList.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                fv fvVar = (fv) obj;
                fvVar.getClass();
                if (!fvVar.a.equals(str)) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i < arrayList.size() && i <= (size = arrayList.size() - 1)) {
            while (true) {
                arrayList.remove(size);
                if (size == i) {
                    break;
                } else {
                    size--;
                }
            }
        }
        f(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l00] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public List e() {
        l00 l00Var;
        ArrayList arrayList;
        String string = ((SharedPreferences) this.f).getString("notes", null);
        di diVar = di.f;
        if (string == null) {
            return diVar;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            xo y0 = o8.y0(0, jSONArray.length());
            l00Var = new ArrayList(db.G0(y0));
            Iterator it = y0.iterator();
            while (((wo) it).h) {
                wo woVar = (wo) it;
                int i = woVar.i;
                if (i != woVar.g) {
                    woVar.i = woVar.f + i;
                } else {
                    if (!woVar.h) {
                        throw new NoSuchElementException();
                    }
                    woVar.h = false;
                }
                List list = fv.h;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                jSONObject.getClass();
                l00Var.add(o8.u(jSONObject));
            }
        } catch (Throwable th) {
            l00Var = new l00(th);
        }
        if ((l00Var instanceof l00 ? l00Var.f : null) == null) {
            diVar = l00Var;
        }
        di diVar2 = diVar;
        pv pvVar = new pv(new ja(4));
        boolean z = diVar2 instanceof Collection;
        if (z) {
            di diVar3 = diVar2;
            if (diVar3.size() <= 1) {
                return bb.K0(diVar3);
            }
            Object[] array = diVar3.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, pvVar);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        if (z) {
            arrayList = new ArrayList(diVar2);
        } else {
            arrayList = new ArrayList();
            Iterator it2 = diVar2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        Collections.sort(arrayList, pvVar);
        return arrayList;
    }

    public void f(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((fv) obj).b());
        }
        ((SharedPreferences) this.f).edit().putString("notes", jSONArray.toString()).apply();
    }

    public void g(fv fvVar) {
        fvVar.getClass();
        ArrayList arrayList = new ArrayList(e());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((fv) obj).a.equals(fvVar.a)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.set(i, fvVar);
        } else {
            arrayList.add(0, fvVar);
        }
        f(arrayList);
    }

    @Override // defpackage.g9
    public void onCancel() {
        ((k30) this.f).a();
    }
}
