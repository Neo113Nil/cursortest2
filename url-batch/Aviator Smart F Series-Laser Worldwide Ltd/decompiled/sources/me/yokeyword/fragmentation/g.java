package me.yokeyword.fragmentation;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentationMagician;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class g {
    private static final long SHOW_SPACE = 200;

    static class a implements Runnable {
        final /* synthetic */ InputMethodManager val$imm;
        final /* synthetic */ View val$view;

        a(InputMethodManager inputMethodManager, View view) {
            this.val$imm = inputMethodManager;
            this.val$view = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$imm.showSoftInput(this.val$view, 2);
        }
    }

    private g() {
    }

    static <T extends d> T findBackStackFragment(Class<T> cls, String str, FragmentManager fragmentManager) {
        int backStackEntryCount = fragmentManager.getBackStackEntryCount();
        if (str == null) {
            str = cls.getName();
        }
        for (int i8 = backStackEntryCount - 1; i8 >= 0; i8--) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i8);
            if (str.equals(backStackEntryAt.getName())) {
                ActivityResultCaller findFragmentByTag = fragmentManager.findFragmentByTag(backStackEntryAt.getName());
                if (findFragmentByTag instanceof d) {
                    return (T) findFragmentByTag;
                }
            }
        }
        return null;
    }

    public static <T extends d> T findFragment(FragmentManager fragmentManager, Class<T> cls) {
        return (T) findStackFragment(cls, null, fragmentManager);
    }

    static <T extends d> T findStackFragment(Class<T> cls, String str, FragmentManager fragmentManager) {
        Object obj = null;
        if (str == null) {
            List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
            if (activeFragments != null) {
                int size = activeFragments.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment = activeFragments.get(size);
                    if ((fragment instanceof d) && fragment.getClass().getName().equals(cls.getName())) {
                        obj = fragment;
                        break;
                    }
                    size--;
                }
            } else {
                return null;
            }
        } else {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (findFragmentByTag == null) {
                return null;
            }
            obj = findFragmentByTag;
        }
        return (T) obj;
    }

    public static d getActiveFragment(FragmentManager fragmentManager) {
        return getActiveFragment(fragmentManager, null);
    }

    public static d getBackStackTopFragment(FragmentManager fragmentManager) {
        return getBackStackTopFragment(fragmentManager, 0);
    }

    public static d getPreFragment(Fragment fragment) {
        List<Fragment> activeFragments;
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null || (activeFragments = FragmentationMagician.getActiveFragments(fragmentManager)) == null) {
            return null;
        }
        for (int indexOf = activeFragments.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
            ActivityResultCaller activityResultCaller = (Fragment) activeFragments.get(indexOf);
            if (activityResultCaller instanceof d) {
                return (d) activityResultCaller;
            }
        }
        return null;
    }

    public static d getTopFragment(FragmentManager fragmentManager) {
        return getTopFragment(fragmentManager, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r3 < r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static List<Fragment> getWillPopFragments(FragmentManager fragmentManager, String str, boolean z7) {
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(str);
        ArrayList arrayList = new ArrayList();
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
        if (activeFragments == null) {
            return arrayList;
        }
        int size = activeFragments.size();
        int i8 = size - 1;
        int i9 = i8;
        while (true) {
            if (i9 < 0) {
                break;
            }
            if (findFragmentByTag != activeFragments.get(i9)) {
                i9--;
            } else if (!z7) {
                i9++;
            }
        }
        if (i9 == -1) {
            return arrayList;
        }
        while (i8 >= i9) {
            Fragment fragment = activeFragments.get(i8);
            if (fragment != null && fragment.getView() != null) {
                arrayList.add(fragment);
            }
            i8--;
        }
        return arrayList;
    }

    public static void hideSoftInput(View view) {
        if (view == null || view.getContext() == null) {
            return;
        }
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void logFragmentStackHierarchy(c cVar, String str) {
        cVar.getSupportDelegate().logFragmentStackHierarchy(str);
    }

    public static void showFragmentStackHierarchyView(c cVar) {
        cVar.getSupportDelegate().showFragmentStackHierarchyView();
    }

    public static void showSoftInput(View view) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        view.requestFocus();
        view.postDelayed(new a(inputMethodManager, view), SHOW_SPACE);
    }

    public static <T extends d> T findFragment(FragmentManager fragmentManager, String str) {
        return (T) findStackFragment(null, str, fragmentManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d getActiveFragment(FragmentManager fragmentManager, d dVar) {
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
        if (activeFragments == null) {
            return dVar;
        }
        for (int size = activeFragments.size() - 1; size >= 0; size--) {
            Fragment fragment = activeFragments.get(size);
            if ((fragment instanceof d) && fragment.isResumed() && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                return getActiveFragment(fragment.getChildFragmentManager(), (d) fragment);
            }
        }
        return dVar;
    }

    public static d getBackStackTopFragment(FragmentManager fragmentManager, int i8) {
        for (int backStackEntryCount = fragmentManager.getBackStackEntryCount() - 1; backStackEntryCount >= 0; backStackEntryCount--) {
            ActivityResultCaller findFragmentByTag = fragmentManager.findFragmentByTag(fragmentManager.getBackStackEntryAt(backStackEntryCount).getName());
            if (findFragmentByTag instanceof d) {
                d dVar = (d) findFragmentByTag;
                if (i8 == 0 || i8 == dVar.getSupportDelegate().mContainerId) {
                    return dVar;
                }
            }
        }
        return null;
    }

    public static d getTopFragment(FragmentManager fragmentManager, int i8) {
        List<Fragment> activeFragments = FragmentationMagician.getActiveFragments(fragmentManager);
        if (activeFragments == null) {
            return null;
        }
        for (int size = activeFragments.size() - 1; size >= 0; size--) {
            ActivityResultCaller activityResultCaller = (Fragment) activeFragments.get(size);
            if (activityResultCaller instanceof d) {
                d dVar = (d) activityResultCaller;
                if (i8 == 0 || i8 == dVar.getSupportDelegate().mContainerId) {
                    return dVar;
                }
            }
        }
        return null;
    }
}
