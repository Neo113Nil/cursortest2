package l;

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
import com.fc.barca.football.R;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f0 extends I.b implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f9794y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f9795i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9796j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f9797k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f9798l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f9799m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f9800n;
    public final WeakHashMap o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9801p;

    /* renamed from: q, reason: collision with root package name */
    public int f9802q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f9803r;

    /* renamed from: s, reason: collision with root package name */
    public int f9804s;

    /* renamed from: t, reason: collision with root package name */
    public int f9805t;

    /* renamed from: u, reason: collision with root package name */
    public int f9806u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public int f9807w;

    /* renamed from: x, reason: collision with root package name */
    public int f9808x;

    public f0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f606b = true;
        this.f607c = null;
        this.f605a = false;
        this.f608d = context;
        this.f609e = -1;
        this.f = new E1.q(this);
        this.f610g = new I.a(0, this);
        this.f9796j = suggestionRowLayout;
        this.f9795i = suggestionRowLayout;
        this.f9797k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f9802q = 1;
        this.f9804s = -1;
        this.f9805t = -1;
        this.f9806u = -1;
        this.v = -1;
        this.f9807w = -1;
        this.f9808x = -1;
        this.f9798l = searchView;
        this.f9799m = searchableInfo;
        this.f9801p = searchView.getSuggestionCommitIconResId();
        this.f9800n = context;
        this.o = weakHashMap;
    }

    public static String h(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    @Override // I.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        Drawable f;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        e0 e0Var = (e0) view.getTag();
        int i3 = this.f9808x;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        TextView textView = e0Var.f9787a;
        if (textView != null) {
            String h3 = h(cursor, this.f9804s);
            textView.setText(h3);
            if (TextUtils.isEmpty(h3)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = e0Var.f9788b;
        if (textView2 != null) {
            String h4 = h(cursor, this.f9806u);
            if (h4 != null) {
                if (this.f9803r == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f608d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f9803r = this.f608d.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h4);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f9803r, null), 0, h4.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f9805t);
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
        ImageView imageView = e0Var.f9789c;
        if (imageView != null) {
            int i5 = this.v;
            if (i5 == -1) {
                f = null;
            } else {
                f = f(cursor.getString(i5));
                if (f == null) {
                    ComponentName searchActivity = this.f9799m.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.o;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        f = constantState == null ? null : constantState.newDrawable(this.f9800n.getResources());
                    } else {
                        PackageManager packageManager = this.f608d.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.w("SuggestionsAdapter", e3.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + searchActivity.flattenToShortString());
                            } else {
                                f = drawable;
                                weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                            }
                        }
                        f = null;
                        weakHashMap.put(flattenToShortString, f != null ? null : f.getConstantState());
                    }
                    if (f == null) {
                        f = this.f608d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(f);
            if (f == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                f.setVisible(false, false);
                f.setVisible(true, false);
            }
        }
        ImageView imageView2 = e0Var.f9790d;
        if (imageView2 != null) {
            int i6 = this.f9807w;
            Drawable f3 = i6 == -1 ? null : f(cursor.getString(i6));
            imageView2.setImageDrawable(f3);
            if (f3 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                f3.setVisible(false, false);
                f3.setVisible(true, false);
            }
        }
        int i7 = this.f9802q;
        ImageView imageView3 = e0Var.f9791e;
        if (i7 != 2 && (i7 != 1 || (i4 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // I.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f9804s = cursor.getColumnIndex("suggest_text_1");
                this.f9805t = cursor.getColumnIndex("suggest_text_2");
                this.f9806u = cursor.getColumnIndex("suggest_text_2_url");
                this.v = cursor.getColumnIndex("suggest_icon_1");
                this.f9807w = cursor.getColumnIndex("suggest_icon_2");
                this.f9808x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // I.b
    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f9799m;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // I.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f9797k.inflate(this.f9795i, viewGroup, false);
        inflate.setTag(new e0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f9801p);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f608d.getPackageManager().getResourcesForApplication(authority);
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
        WeakHashMap weakHashMap = this.o;
        Context context = this.f9800n;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !CommonUrlParts.Values.FALSE_INTEGER.equals(str)) {
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
                } catch (FileNotFoundException e3) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e3.getMessage());
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
                        } catch (IOException e4) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e4);
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
        return this.f608d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // I.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View inflate = this.f9797k.inflate(this.f9796j, viewGroup, false);
            if (inflate != null) {
                ((e0) inflate.getTag()).f9787a.setText(e3.toString());
            }
            return inflate;
        }
    }

    @Override // I.b, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View d3 = d(viewGroup);
            ((e0) d3.getTag()).f9787a.setText(e3.toString());
            return d3;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f607c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f607c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9798l.n((CharSequence) tag);
        }
    }
}
