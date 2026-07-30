package com.crrepa.band.my.device.contact.adapter;

import android.content.Context;
import android.net.Uri;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.ContactModel;
import com.orhanobut.logger.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends me.yokeyword.indexablerv.d implements Filterable {
    private Context context;
    private LayoutInflater inflater;
    private List<ContactModel> items;
    private List<Uri> invalidAvatarList = new ArrayList();
    private BidiFormatter bidiFormatter = BidiFormatter.getInstance();

    /* renamed from: com.crrepa.band.my.device.contact.adapter.a$a, reason: collision with other inner class name */
    class C0172a implements e {
        final /* synthetic */ Uri val$avatarUri;
        final /* synthetic */ String val$name;
        final /* synthetic */ c val$vh;
        final /* synthetic */ boolean val$visible;

        C0172a(Uri uri, c cVar, String str, boolean z7) {
            this.val$avatarUri = uri;
            this.val$vh = cVar;
            this.val$name = str;
            this.val$visible = z7;
        }

        @Override // com.squareup.picasso.e
        public void onError(Exception exc) {
            a.this.invalidAvatarList.add(this.val$avatarUri);
            exc.printStackTrace();
            a.this.setContactAvatarOfName(this.val$vh, this.val$name, this.val$visible);
        }

        @Override // com.squareup.picasso.e
        public void onSuccess() {
        }
    }

    class b extends Filter {
        b() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            f.d("performFiltering: " + ((Object) charSequence));
            if (a.this.items == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(charSequence)) {
                arrayList.addAll(a.this.items);
            } else {
                for (ContactModel contactModel : a.this.items) {
                    if (contactModel.getPinyin().startsWith(charSequence.toString()) || contactModel.getName().contains(charSequence)) {
                        arrayList.add(contactModel);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.count = arrayList.size();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults != null) {
                a.this.setSearchResult((ArrayList) filterResults.values);
            }
        }
    }

    private class c extends RecyclerView.ViewHolder {
        ImageView ivAvatar;
        ImageView ivAvatarLine;
        ImageView ivChecked;
        TextView tvAvatar;
        TextView tvName;
        TextView tvNumber;
        View viewLevel1;
        View viewLevel2;

        public c(View view) {
            super(view);
            this.ivAvatar = (ImageView) view.findViewById(R.id.iv_avatar);
            this.tvAvatar = (TextView) view.findViewById(R.id.tv_avatar);
            this.ivAvatarLine = (ImageView) view.findViewById(R.id.iv_avatar_line);
            this.tvName = (TextView) view.findViewById(R.id.tv_name);
            this.tvNumber = (TextView) view.findViewById(R.id.tv_number);
            this.ivChecked = (ImageView) view.findViewById(R.id.iv_checked);
            this.viewLevel1 = view.findViewById(R.id.view_level1);
            this.viewLevel2 = view.findViewById(R.id.view_level2);
        }
    }

    private class d extends RecyclerView.ViewHolder {
        TextView tvTitle;

        public d(View view) {
            super(view);
            this.tvTitle = (TextView) view.findViewById(R.id.tv_title);
        }
    }

    public a(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContactAvatarOfName(c cVar, String str, boolean z7) {
        cVar.ivAvatar.setVisibility(8);
        if (z7) {
            cVar.tvAvatar.setVisibility(0);
        } else {
            cVar.tvAvatar.setVisibility(4);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        cVar.tvAvatar.setText(str.substring(0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchResult(ArrayList<ContactModel> arrayList) {
        super.setDatas(arrayList);
    }

    private void showAvatar(c cVar, Uri uri, String str, boolean z7) {
        if (this.invalidAvatarList.contains(uri)) {
            setContactAvatarOfName(cVar, str, z7);
        } else {
            Picasso.get().load(uri).into(cVar.ivAvatar, new C0172a(uri, cVar, str, z7));
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new b();
    }

    @Override // me.yokeyword.indexablerv.d
    public void onBindTitleViewHolder(RecyclerView.ViewHolder viewHolder, String str) {
        ((d) viewHolder).tvTitle.setText(str);
    }

    @Override // me.yokeyword.indexablerv.d
    public RecyclerView.ViewHolder onCreateContentViewHolder(ViewGroup viewGroup) {
        return new c(this.inflater.inflate(R.layout.item_select_contact_content, viewGroup, false));
    }

    @Override // me.yokeyword.indexablerv.d
    public RecyclerView.ViewHolder onCreateTitleViewHolder(ViewGroup viewGroup) {
        return new d(this.inflater.inflate(R.layout.item_select_contact_title, viewGroup, false));
    }

    @Override // me.yokeyword.indexablerv.d
    public void setDatas(List<ContactModel> list) {
        super.setDatas(list);
        this.items = list;
    }

    @Override // me.yokeyword.indexablerv.d
    public void onBindContentViewHolder(RecyclerView.ViewHolder viewHolder, ContactModel contactModel) {
        c cVar = (c) viewHolder;
        int count = contactModel.getCount();
        int index = contactModel.getIndex();
        String name = contactModel.getName();
        Uri contactAvatarUri = w0.a.getContactAvatarUri(this.context, name);
        f.d(name + ": " + contactAvatarUri);
        if (1 >= count || index == 0) {
            if (contactAvatarUri == null) {
                cVar.ivAvatarLine.setVisibility(8);
                setContactAvatarOfName(cVar, name, true);
            } else {
                cVar.tvAvatar.setVisibility(8);
                cVar.ivAvatar.setVisibility(0);
                cVar.ivAvatarLine.setVisibility(8);
                showAvatar(cVar, contactAvatarUri, name, true);
            }
            cVar.tvName.setVisibility(0);
        } else {
            if (contactAvatarUri == null) {
                cVar.ivAvatar.setVisibility(8);
                cVar.tvAvatar.setVisibility(4);
                if (!TextUtils.isEmpty(name)) {
                    cVar.tvAvatar.setText(name.substring(0, 1));
                }
            } else {
                cVar.ivAvatar.setVisibility(4);
                cVar.tvAvatar.setVisibility(8);
                showAvatar(cVar, contactAvatarUri, name, false);
            }
            cVar.ivAvatarLine.setVisibility(0);
            if (index == count) {
                cVar.ivAvatarLine.setImageResource(R$drawable.line_contact_1);
            } else {
                cVar.ivAvatarLine.setImageResource(R$drawable.line_contact_0);
            }
            cVar.tvName.setVisibility(8);
        }
        cVar.tvName.setText(name);
        cVar.tvNumber.setText(this.bidiFormatter.unicodeWrap(contactModel.getNumber()));
        if (contactModel.isCheched()) {
            cVar.ivChecked.setVisibility(0);
        } else {
            cVar.ivChecked.setVisibility(4);
        }
        if (1 >= count || index >= count) {
            cVar.viewLevel1.setVisibility(0);
            cVar.viewLevel2.setVisibility(8);
        } else {
            cVar.viewLevel1.setVisibility(8);
            cVar.viewLevel2.setVisibility(0);
        }
    }
}
