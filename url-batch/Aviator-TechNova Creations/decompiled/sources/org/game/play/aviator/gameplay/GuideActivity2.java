package org.game.play.aviator.gameplay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import java.util.ArrayList;
import java.util.List;
import org.game.play.aviator.gameplay.databinding.ActivityGuide2Binding;

/* loaded from: classes3.dex */
public class GuideActivity2 extends AppCompatActivity {
    private CountryAdapter adapter;
    private ActivityGuide2Binding binding;
    private List<Country> countryList;
    private List<Country> filteredList;
    private int selectedPosition = -1;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGuide2Binding inflate = ActivityGuide2Binding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GuideActivity2$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GuideActivity2.this.m2206lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity2(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        initCountryList();
        this.adapter = new CountryAdapter(this, this.filteredList);
        this.binding.lvCountries.setAdapter((ListAdapter) this.adapter);
        this.binding.lvCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity2$$ExternalSyntheticLambda2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                GuideActivity2.this.m2207lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity2(adapterView, view, i, j);
            }
        });
        this.binding.etSearchCountry.addTextChangedListener(new TextWatcher() { // from class: org.game.play.aviator.gameplay.GuideActivity2.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                GuideActivity2.this.adapter.getFilter().filter(charSequence);
            }
        });
        this.binding.btn2.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity2$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity2.this.m2209lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity2(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.GuideActivity2$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GuideActivity2.this);
            final GuideActivity2 guideActivity2 = GuideActivity2.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity2$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity2.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GuideActivity2, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2206lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity2(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.llHeader.setPadding(this.binding.llHeader.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + this.binding.llHeader.getPaddingTop(), this.binding.llHeader.getPaddingRight(), this.binding.llHeader.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-GuideActivity2, reason: not valid java name */
    /* synthetic */ void m2207lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity2(AdapterView adapterView, View view, int i, long j) {
        this.selectedPosition = i;
        this.adapter.notifyDataSetChanged();
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-GuideActivity2, reason: not valid java name */
    /* synthetic */ void m2209lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity2(View view) {
        if (this.selectedPosition == -1) {
            Toast.makeText(this, "Please select your country", 0).show();
        } else {
            AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity2$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity2.this.m2208lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity2();
                }
            }, Click.GUIDE, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-GuideActivity2, reason: not valid java name */
    /* synthetic */ void m2208lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity2() {
        startActivity(new Intent(this, (Class<?>) GuideActivity3.class));
    }

    private void initCountryList() {
        ArrayList arrayList = new ArrayList();
        this.countryList = arrayList;
        arrayList.add(new Country("United States", R.drawable.usa));
        this.countryList.add(new Country("India", R.drawable.india));
        this.countryList.add(new Country("France", R.drawable.french));
        this.countryList.add(new Country("Russia", R.drawable.russia));
        this.countryList.add(new Country("Italy", R.drawable.italy));
        this.countryList.add(new Country("Japan", R.drawable.japanese));
        this.countryList.add(new Country("Spain", R.drawable.spenish));
        this.countryList.add(new Country("Germany", R.drawable.german));
        this.countryList.add(new Country("Canada", R.drawable.canada));
        this.countryList.add(new Country("Afghanistan", R.drawable.afghanistan));
        this.countryList.add(new Country("Arabia", R.drawable.arabic));
        this.countryList.add(new Country("Other", R.drawable.other));
        this.filteredList = new ArrayList(this.countryList);
    }

    private static class Country {
        int flagResId;
        String name;

        Country(String str, int i) {
            this.name = str;
            this.flagResId = i;
        }
    }

    private class CountryAdapter extends BaseAdapter implements Filterable {
        private final Context context;
        private List<Country> list;
        private final List<Country> originalList;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public CountryAdapter(Context context, List<Country> list) {
            this.context = context;
            this.list = list;
            this.originalList = new ArrayList(list);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.list.get(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(this.context).inflate(R.layout.item_country, viewGroup, false);
            }
            Country country = this.list.get(i);
            ImageView imageView = (ImageView) view.findViewById(R.id.ivCountryFlag);
            ((TextView) view.findViewById(R.id.tvCountryName)).setText(country.name);
            imageView.setImageResource(country.flagResId);
            if (GuideActivity2.this.selectedPosition == i) {
                view.setBackgroundResource(R.drawable.bg_language_card_selected);
                return view;
            }
            view.setBackgroundResource(R.drawable.bg_language_card_unselected);
            return view;
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            return new Filter() { // from class: org.game.play.aviator.gameplay.GuideActivity2.CountryAdapter.1
                @Override // android.widget.Filter
                protected Filter.FilterResults performFiltering(CharSequence charSequence) {
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    if (charSequence == null || charSequence.length() == 0) {
                        filterResults.values = CountryAdapter.this.originalList;
                        filterResults.count = CountryAdapter.this.originalList.size();
                        return filterResults;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Country country : CountryAdapter.this.originalList) {
                        if (country.name.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                            arrayList.add(country);
                        }
                    }
                    filterResults.values = arrayList;
                    filterResults.count = arrayList.size();
                    return filterResults;
                }

                @Override // android.widget.Filter
                protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
                    CountryAdapter.this.list = (List) filterResults.values;
                    GuideActivity2.this.selectedPosition = -1;
                    CountryAdapter.this.notifyDataSetChanged();
                }
            };
        }
    }
}
