package i;

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
import com.crane.slab.beam.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p.AbstractC0215a;

/* loaded from: classes.dex */
public final class f0 extends D.c implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f2202C = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f2203A;

    /* renamed from: B, reason: collision with root package name */
    public int f2204B;

    /* renamed from: m, reason: collision with root package name */
    public final int f2205m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2206n;

    /* renamed from: o, reason: collision with root package name */
    public final LayoutInflater f2207o;

    /* renamed from: p, reason: collision with root package name */
    public final SearchView f2208p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchableInfo f2209q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f2210r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakHashMap f2211s;
    public final int t;

    /* renamed from: u, reason: collision with root package name */
    public int f2212u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2213v;

    /* renamed from: w, reason: collision with root package name */
    public int f2214w;

    /* renamed from: x, reason: collision with root package name */
    public int f2215x;

    /* renamed from: y, reason: collision with root package name */
    public int f2216y;

    /* renamed from: z, reason: collision with root package name */
    public int f2217z;

    public f0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f191f = true;
        this.f192g = null;
        this.f190e = false;
        this.f193h = context;
        this.f194i = -1;
        this.f195j = new D.a(this);
        this.f196k = new D.b(0, this);
        this.f2206n = suggestionRowLayout;
        this.f2205m = suggestionRowLayout;
        this.f2207o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f2212u = 1;
        this.f2214w = -1;
        this.f2215x = -1;
        this.f2216y = -1;
        this.f2217z = -1;
        this.f2203A = -1;
        this.f2204B = -1;
        this.f2208p = searchView;
        this.f2209q = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.f2210r = context;
        this.f2211s = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    @Override // D.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i2;
        int i3;
        Drawable f2;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        e0 e0Var = (e0) view.getTag();
        int i4 = this.f2204B;
        int i5 = i4 != -1 ? cursor.getInt(i4) : 0;
        TextView textView = e0Var.f2195a;
        TextView textView2 = e0Var.f2196b;
        ImageView imageView = e0Var.f2199e;
        if (textView != null) {
            String h2 = h(cursor, this.f2214w);
            textView.setText(h2);
            if (TextUtils.isEmpty(h2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        if (textView2 != null) {
            String h3 = h(cursor, this.f2216y);
            if (h3 != null) {
                if (this.f2213v == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f193h.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f2213v = this.f193h.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f2213v, null), 0, h3.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f2215x);
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
        ImageView imageView2 = e0Var.f2197c;
        if (imageView2 != null) {
            int i6 = this.f2217z;
            if (i6 == -1) {
                f2 = null;
            } else {
                f2 = f(cursor.getString(i6));
                if (f2 == null) {
                    ComponentName searchActivity = this.f2209q.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f2211s;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f2 = constantState == null ? null : constantState.newDrawable(this.f2210r.getResources());
                    } else {
                        PackageManager packageManager = this.f193h.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("SuggestionsAdapter", e2.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f2 = drawable;
                                weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                            }
                        }
                        f2 = null;
                        weakHashMap.put(flattenToShortString, f2 != null ? null : f2.getConstantState());
                    }
                    if (f2 == null) {
                        f2 = this.f193h.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f2);
            if (f2 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f2.setVisible(false, false);
                f2.setVisible(true, false);
            }
        }
        ImageView imageView3 = e0Var.f2198d;
        if (imageView3 != null) {
            int i7 = this.f2203A;
            Drawable f3 = i7 == -1 ? null : f(cursor.getString(i7));
            imageView3.setImageDrawable(f3);
            if (f3 != null) {
                imageView3.setVisibility(0);
                f3.setVisible(false, false);
                i2 = 1;
                f3.setVisible(true, false);
                i3 = this.f2212u;
                if (i3 == 2 && (i3 != i2 || (i5 & 1) == 0)) {
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
        i3 = this.f2212u;
        if (i3 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // D.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f2214w = cursor.getColumnIndex("suggest_text_1");
                this.f2215x = cursor.getColumnIndex("suggest_text_2");
                this.f2216y = cursor.getColumnIndex("suggest_text_2_url");
                this.f2217z = cursor.getColumnIndex("suggest_icon_1");
                this.f2203A = cursor.getColumnIndex("suggest_icon_2");
                this.f2204B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // D.c
    public final String c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        SearchableInfo searchableInfo = this.f2209q;
        if (searchableInfo.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    @Override // D.c
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f2207o.inflate(this.f2205m, viewGroup, false);
        inflate.setTag(new e0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.t);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f193h.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.f2211s;
        Context context = this.f2210r;
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
                Drawable b2 = AbstractC0215a.b(context, parseInt);
                if (b2 != null) {
                    weakHashMap.put(str2, b2.getConstantState());
                }
                return b2;
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
                } catch (FileNotFoundException e2) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e2.getMessage());
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
                        } catch (IOException e3) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e3);
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
        return this.f193h.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // D.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f2207o.inflate(this.f2206n, viewGroup, false);
            if (inflate != null) {
                ((e0) inflate.getTag()).f2195a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // D.c, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(viewGroup);
            ((e0) d2.getTag()).f2195a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f192g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f192g;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2208p.n((CharSequence) tag);
        }
    }
}
