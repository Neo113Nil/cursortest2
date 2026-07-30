package n;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f1 extends M.c implements View.OnClickListener {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f6765F = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f6766A;

    /* renamed from: B, reason: collision with root package name */
    public int f6767B;

    /* renamed from: C, reason: collision with root package name */
    public int f6768C;

    /* renamed from: D, reason: collision with root package name */
    public int f6769D;

    /* renamed from: E, reason: collision with root package name */
    public int f6770E;

    /* renamed from: p, reason: collision with root package name */
    public final int f6771p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6772q;

    /* renamed from: r, reason: collision with root package name */
    public final LayoutInflater f6773r;

    /* renamed from: s, reason: collision with root package name */
    public final SearchView f6774s;

    /* renamed from: t, reason: collision with root package name */
    public final SearchableInfo f6775t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f6776u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f6777v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6778w;

    /* renamed from: x, reason: collision with root package name */
    public int f6779x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f6780y;

    /* renamed from: z, reason: collision with root package name */
    public int f6781z;

    public f1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f1712e = true;
        this.f1713i = null;
        this.f1711d = false;
        this.f1714l = -1;
        this.f1715m = new M.a(this);
        this.f1716n = new M.b(0, this);
        this.f6772q = suggestionRowLayout;
        this.f6771p = suggestionRowLayout;
        this.f6773r = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f6779x = 1;
        this.f6781z = -1;
        this.f6766A = -1;
        this.f6767B = -1;
        this.f6768C = -1;
        this.f6769D = -1;
        this.f6770E = -1;
        this.f6774s = searchView;
        this.f6775t = searchableInfo;
        this.f6778w = searchView.getSuggestionCommitIconResId();
        this.f6776u = context;
        this.f6777v = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    @Override // M.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i2;
        int i5;
        Drawable f7;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        e1 e1Var = (e1) view.getTag();
        int i7 = this.f6770E;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        TextView textView = e1Var.f6758a;
        TextView textView2 = e1Var.f6759b;
        ImageView imageView = e1Var.f6762e;
        if (textView != null) {
            String h7 = h(cursor, this.f6781z);
            textView.setText(h7);
            if (TextUtils.isEmpty(h7)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f6776u;
        if (textView2 != null) {
            String h8 = h(cursor, this.f6767B);
            if (h8 != null) {
                if (this.f6780y == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f6780y = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h8);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f6780y, null), 0, h8.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f6766A);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = e1Var.f6760c;
        if (imageView2 != null) {
            int i9 = this.f6768C;
            if (i9 == -1) {
                f7 = null;
            } else {
                f7 = f(cursor.getString(i9));
                if (f7 == null) {
                    ComponentName searchActivity = this.f6775t.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f6777v;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f7 = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.w("SuggestionsAdapter", e7.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder k7 = C4.p.k(iconResource, "Invalid icon resource ", " for ");
                                k7.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", k7.toString());
                            } else {
                                f7 = drawable;
                                weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                            }
                        }
                        f7 = null;
                        weakHashMap.put(flattenToShortString, f7 != null ? null : f7.getConstantState());
                    }
                    if (f7 == null) {
                        f7 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f7);
            if (f7 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f7.setVisible(false, false);
                f7.setVisible(true, false);
            }
        }
        ImageView imageView3 = e1Var.f6761d;
        if (imageView3 != null) {
            int i10 = this.f6769D;
            Drawable f8 = i10 == -1 ? null : f(cursor.getString(i10));
            imageView3.setImageDrawable(f8);
            if (f8 != null) {
                imageView3.setVisibility(0);
                f8.setVisible(false, false);
                i2 = 1;
                f8.setVisible(true, false);
                i5 = this.f6779x;
                if (i5 == 2 && (i5 != i2 || (i8 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
            imageView3.setVisibility(8);
        }
        i2 = 1;
        i5 = this.f6779x;
        if (i5 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // M.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f6781z = cursor.getColumnIndex("suggest_text_1");
                this.f6766A = cursor.getColumnIndex("suggest_text_2");
                this.f6767B = cursor.getColumnIndex("suggest_text_2_url");
                this.f6768C = cursor.getColumnIndex("suggest_icon_1");
                this.f6769D = cursor.getColumnIndex("suggest_icon_2");
                this.f6770E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // M.c
    public final String c(Cursor cursor) {
        String h7;
        String h8;
        if (cursor == null) {
            return null;
        }
        String h9 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h9 != null) {
            return h9;
        }
        SearchableInfo searchableInfo = this.f6775t;
        if (searchableInfo.shouldRewriteQueryFromData() && (h8 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h8;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h7 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h7;
    }

    @Override // M.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f6773r.inflate(this.f6771p, viewGroup, false);
        inflate.setTag(new e1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f6778w);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f6776u.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        WeakHashMap weakHashMap = this.f6777v;
        Context context = this.f6776u;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable newDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e7) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e7.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream == null) {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e8) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e8);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } finally {
                    }
                }
            }
        }
        return drawable;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f6776u.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // M.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View inflate = this.f6773r.inflate(this.f6772q, viewGroup, false);
            if (inflate != null) {
                ((e1) inflate.getTag()).f6758a.setText(e7.toString());
            }
            return inflate;
        }
    }

    @Override // M.c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View d7 = d(viewGroup);
            ((e1) d7.getTag()).f6758a.setText(e7.toString());
            return d7;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f1713i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f1713i;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f6774s.o((CharSequence) tag);
        }
    }
}
